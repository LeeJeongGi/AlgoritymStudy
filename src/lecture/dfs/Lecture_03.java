package src.lecture.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lecture_03 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] board, dis;
    static int n,m;
    static Queue<Point> queue = new LinkedList<>();

    public static void main(String[] args) {
        /**
         * DFS - 토마토
         */
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        dis = new int[n][m];
        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1) {
                    queue.offer(new Point(i, j));
                }
            }
        }

        BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    flag = false;
                }
            }
        }

        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }

            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }

    public static void BFS() {
        while (!queue.isEmpty()) {
            Point temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = temp.x + dx[i];
                int nextY = temp.y + dy[i];

                if (0 <= nextX && nextX < n && 0 <= nextY && nextY < m && board[nextX][nextY] == 0) {
                    board[nextX][nextY] = 1;
                    queue.offer(new Point(nextX, nextY));
                    dis[nextX][nextY] = dis[temp.x][temp.y] + 1;
                }
            }
        }
    }

    static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
