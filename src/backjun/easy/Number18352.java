package src.backjun.easy;

import java.util.*;
import java.util.stream.IntStream;

public class Number18352 {

    static ArrayList<Integer>[] cities;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) {
        /**
         * 특정 거리의 도시 찾기
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();

        cities = new ArrayList[N + 1];
        distance = new int[N + 1];
        visited = new boolean[N + 1];
        IntStream.rangeClosed(1, N)
                .forEach(i -> {
                    cities[i] = new ArrayList<>();
                });

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            cities[start].add(end);
        }

        bfs(X);
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (distance[i] == K) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) {
            System.out.println("-1");
        } else {
            for (Integer integer : answer) {
                System.out.println(integer);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        distance[v] = 0;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i : cities[temp]) {
                if (!visited[i]) {
                    queue.add(i);
                    distance[i] = distance[temp] + 1;
                    visited[i] = true;
                }
            }
        }
    }
}
