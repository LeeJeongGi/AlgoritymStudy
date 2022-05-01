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

        //가로
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
               sum += board[i][j];
            }
            if (max < sum) {
                max = sum;
            }
        }

        //세로
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += board[j][i];
            }
            if (max < sum) {
                max = sum;
            }
        }

        //대각선
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += board[i][i];

            if (max < sum) {
                max = sum;
            }
        }

        return max;
    }
}
