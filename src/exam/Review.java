package src.exam;

import java.util.*;
import java.util.stream.IntStream;

public class Review {

    static int N, M, start;
    static ArrayList<Point>[] nodes;
    static boolean[] visited;
    static int answer = 0;
    static boolean arrive;
    static int[][] map;
    static int[] distance;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        /**
         * 문제 다시 푸는 페이지?!
         */
//        int answer = 0;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        nodes = new ArrayList[N + 1];
        IntStream.rangeClosed(1, N)
                .forEach(i -> nodes[i] = new ArrayList<>());

        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            while (true) {
                int e = sc.nextInt();

                if (e == -1) {
                    break;
                }

                int v = sc.nextInt();
                nodes[s].add(new Point(e, v));
            }
        }

        // 끝에 있는 노드 찾기.
        visited = new boolean[N + 1];
        distance = new int[N + 1];
        bfs(1);
        int max = 1;
        for (int i = 2; i < distance.length; i++) {
            if (distance[max] < distance[i]) {
                max = i;
            }
        }

        visited = new boolean[N + 1];
        distance = new int[N + 1];
        bfs(max);
        Arrays.sort(distance);
        System.out.println(distance[N]);
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (Point point : nodes[temp]) {
                if (!visited[point.node]) {
                    distance[point.node] = distance[temp] + point.cost;
                    visited[point.node] = true;
                    queue.offer(point.node);
                }
            }
        }
    }

    private static class Point {
        int node;
        int cost;

        public Point(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public static void dfs(int now) {


    }
}
