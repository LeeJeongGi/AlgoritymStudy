package src.lecture.dfs;

import java.util.Scanner;

public class Lecture_01 {

    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;

    public static void main(String[] args) {
        /**
         * 미로탐색(DFS)
         */
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        board[1][1] = 1;
        DFS(1, 1);
        System.out.println(answer);
    }

    static void DFS(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if (nextX > 0 && nextY > 0 && nextX < 8 && nextY < 8 && board[nextX][nextY] != 1) {
                    board[nextX][nextY] = 1;
                    DFS(nextX, nextY);
                    board[nextX][nextY] = 0;
                }
            }
        }
    }
}
