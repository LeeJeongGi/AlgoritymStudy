package src.backjun.easy;

import java.util.*;
import java.util.stream.IntStream;

public class Number1260 {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        /**
         * DFS와 BFS 프로그램
         * 1.DFS, BFS 구현 하면 되는 기초 문제
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int start = sc.nextInt();

        graph = new ArrayList[N + 1];

        IntStream.rangeClosed(1, N)
                .forEachOrdered(i -> graph[i] = new ArrayList<>());

        IntStream.rangeClosed(1, M)
                .map(i -> sc.nextInt())
                .forEach(node -> {
                    int edge = sc.nextInt();
                    graph[node].add(edge);
                    graph[edge].add(node);
                });

        // 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        visited = new boolean[N + 1];
        DFS(start);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(start);

    }

    public static void DFS(int node) {
        System.out.print(node + " ");

        visited[node] = true;
        for (int temp : graph[node]) {
            if (!visited[temp]) {
                DFS(temp);
            }
        }
    }

    public static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;

        while (!queue.isEmpty()) {
            int tempNode = queue.poll();
            System.out.print(tempNode + " ");

            for (int temp : graph[tempNode]) {
                if (!visited[temp]) {
                    visited[temp] = true;
                    queue.offer(temp);
                }
            }
        }
    }
}
