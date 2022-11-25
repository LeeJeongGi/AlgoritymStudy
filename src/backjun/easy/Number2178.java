package src.backjun.easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Number2178 {

    static int[][] map;
    static int[][] distance;
    static boolean[][] visited;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N,M;

    public static void main(String[] args) {
        /**
         * 미로 탐색 문제
         * 1. 최솟값을 구해야 하기 때문에 bfs 로 풀면 될 것 같다.
         */
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N + 1][M + 1];
        distance = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String input = sc.next();
            for (int j = 1; j <= M; j++) {
                map[i][j] = Integer.parseInt(input.substring(j - 1, j));
            }
        }

        System.out.println(BFS(1, 1));
    }

    public static int BFS(int x, int y) {
        int answer = 0;

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        distance[x][y] = 1;
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                if (0 < nextX && nextX < N + 1 && 0 < nextY && nextY < M + 1 && map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    distance[nextX][nextY] = distance[point.x][point.y] + 1;
                    visited[nextX][nextY] = true;
                    queue.offer(new Point(nextX, nextY));
                }
            }
        }

        answer = distance[N][M];
        return answer;
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
