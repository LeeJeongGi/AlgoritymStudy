package src.lecture.array;

import java.util.Scanner;

public class Lecture_09 {
    public static void main(String[] args) {

        /**
         * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
         * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(N, board));

    }

    private static int solution(int N, int[][] board) {

        int max = 0;
        int horizontalSum, lengthSum;

        //가로,세로
        for (int i = 0; i < N; i++) {
            horizontalSum = lengthSum = 0;
            for (int j = 0; j < N; j++) {
                horizontalSum += board[i][j];
                lengthSum += board[j][i];
            }

            max = Math.max(max, horizontalSum);
            max = Math.max(max, lengthSum);
        }

        //대각선
        int leftRight = 0;
        int rightLeft = 0;

        for (int i = 0; i < N; i++) {
            leftRight += board[i][i];
            rightLeft += board[i][N - i - 1];
        }
        max = Math.max(max, leftRight);
        max = Math.max(max, rightLeft);

        return max;
    }
}
