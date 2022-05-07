package src.lecture.array;

import java.util.Scanner;

public class Lecture_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] board = new int[N][5];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(N, board));
    }

    private static int solution(int N, int[][] board) {

        int answer = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 5; k++) {
                    if (board[i][k] == board[j][k]) {
                        count++;
                        break;
                    }
                }

            }
            if (max < count) {
                max = count;
                answer = i + 1;
            }
        }

        return answer;
    }
}
