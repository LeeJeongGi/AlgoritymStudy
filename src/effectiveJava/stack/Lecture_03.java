package src.effectiveJava.stack;

import java.util.Scanner;
import java.util.Stack;

public class Lecture_03 {
    public static void main(String[] args) {

        /**
         * 크레인 인형뽑기(카카오)
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int moveCount = sc.nextInt();
        int[] game = new int[moveCount];
        for (int i = 0; i < moveCount; i++) {
            game[i] = sc.nextInt();
        }

        System.out.println(solution(N, board, game));

    }

    private static int solution(int n, int[][] board, int[] game) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int pos : game) {
            for (int i = 0; i < board.length; i++) {

                if (board[i][pos - 1] != 0) {
                    int temp = board[i][pos - 1];
                    board[i][pos - 1] = 0;

                    if (!stack.isEmpty() && stack.peek() == temp) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
