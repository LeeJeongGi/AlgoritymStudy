package src.lecture.twopointer;

import java.util.Scanner;

public class Lecture_05 {
    public static void main(String[] args) {

        /**
         * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
         * 만약 N=15이면
         * 7+8=15
         * 4+5+6=15
         * 1+2+3+4+5=15
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(solution(N));

    }

    private static int solution(int N) {

        int count = 0;

        int sum = 0;
        int pointL = 0;
        int M = N/2 + 1;

        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = i + 1;

        }

        for (int pointR = 0; pointR < M; pointR++) {
            sum += arr[pointR];

            if (sum == N) {
                count++;
            }

            while (sum >= N) {
                sum -= arr[pointL++];
                if (sum == N) {
                    count++;
                }
            }

        }

        return count;
    }
}
