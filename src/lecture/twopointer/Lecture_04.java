package src.lecture.twopointer;

import java.util.Scanner;

public class Lecture_04 {
    public static void main(String[] args) {

        /**
         * N개의 수로 이루어진 수열이 주어집니다.
         * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }

        System.out.println(solution(N, M, values));
    }

    private static int solution(int N, int M, int[] values) {

        int answer = 0, sum = 0, lt=0;

        for (int rt = 0; rt < N; rt++) {

            sum += values[rt];
            if (sum == M) {
                answer++;
            }

            while (sum >= M) {
                sum -= values[lt++];
                if (sum == M) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
