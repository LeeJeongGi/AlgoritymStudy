package src.lecture.dfs;

import java.util.Scanner;

public class Lecture_05 {

    static int n;
    static int[][] island;
    static int[][] direction = {
            {-1, -1}, {-1, 0}, {1, 0}, {0, 1}, {1, 1}, {-1, 1}, {1, -1}, {0, -1}
    };

    public static void main(String[] args) {
        /**
         * 섬찾기 - DFS로 해결
         */
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        island = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                island[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (island[i][j] == 1) {
                    island[i][j] = 0;
                    answer++;
                    DFS(i, j);
                }
            }
        }
        System.out.println(answer);
    }

    public static void DFS(int dx, int dy) {
        for (int i = 0; i < 8; i++) {
            int nextX = dx + direction[i][0];
            int nextY = dy + direction[i][1];

            if (0 <= nextX && 0 <= nextY && nextX < n && nextY < n && island[nextX][nextY] == 1) {
                island[nextX][nextY] = 0;
                DFS(nextX, nextY);
            }
        }
    }
}
