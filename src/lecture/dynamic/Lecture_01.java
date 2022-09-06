package src.lecture.dynamic;

import java.util.Scanner;

public class Lecture_01 {
    public static void main(String[] args) {
        /**
         * 계단 오르기
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(solution(N));
    }

    public static int solution(int N) {
        int[] cash = new int[N + 1];
        cash[1] = 1;
        cash[2] = 2;

        for (int i = 3; i <= N; i++) {
            cash[i] = cash[i - 1] + cash[i - 2];
        }

        return cash[N];
    }
}
