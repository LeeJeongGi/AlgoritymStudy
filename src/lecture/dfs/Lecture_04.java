package src.lecture.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lecture_04 {

    static int n;
    static int[][] island;
    static int[][] check;
    static Queue<Point> queue = new LinkedList<>();

    static int[][] direction = {
            {-1, -1}, {-1, 0}, {1, 0}, {0, 1}, {1, 1}, {-1, 1}, {1, -1}, {0, -1}
    };

    public static void main(String[] args) {
        /**
         * 섬 찾기
         */
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        check = new int[n][n];
        island = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                island[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (island[i][j] == 1 && check[i][j] == 0) {
                    queue.offer(new Point(i, j));
                    check[i][j] = 1;
                    BFS();
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public  static void BFS() {
        while (!queue.isEmpty()) {
            Point temp = queue.poll();

            for (int i = 0; i < 8; i++) {
                int nextX = temp.x + direction[i][0];
                int nextY = temp.y + direction[i][1];

                if (0 <= nextX && nextX < n && 0 <= nextY && nextY < n && island[nextX][nextY] == 1 && check[nextX][nextY] == 0) {
                    check[nextX][nextY] = 1;
                    queue.offer(new Point(nextX, nextY));
                }
            }
        }
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
