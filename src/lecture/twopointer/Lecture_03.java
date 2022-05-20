package src.lecture.twopointer;

import java.util.Scanner;

public class Lecture_03 {
    public static void main(String[] args) {

        /**
         * 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] sales = new int[N];
        for (int i = 0; i < N; i++) {
            sales[i] = sc.nextInt();
        }

        System.out.println(solution(N, K, sales));
    }

    private static int solution(int N, int K, int[] sales) {

        int answer = 0, sum = 0;

        for (int i = 0; i < K; i++) {
            sum += sales[i];
        }
        answer = sum;

        for (int i = K; i < N; i++) {

            sum = sum + sales[i] - sales[i - K];

            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
