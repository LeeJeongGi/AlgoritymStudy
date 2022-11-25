package src.backjun.easy;

import java.util.Scanner;

public class Number2023 {

    static int N;

    public static void main(String[] args) {
        /**
         * 신기한 소수 찾기
         * 소수 관련 문제는 에라토스 체 관련 알고리즘을 통해 풀수도 있지만
         * 이 문제의 경우 DFS 방식으로도 충분히 풀 수가 있다.
         */
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        // 1 자리가 소수 인 수 : 1, 3, 5, 7
        // 1자리 수 소수? -> 2자리수 소수? -> ... -> N자리 수 소수?
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    public static void DFS(int number, int len) {
        if (len == N) {
            if (isDecimal(number)) {
                System.out.println(number);
                return;
            }
        }

        for (int i = 1; i < 10; i++) {

            if (i % 2 == 0) {
                continue;
            }

            if (isDecimal(number * 10 + i)) {
                DFS(number * 10 + i, len + 1);
            }
        }

    }

    public static boolean isDecimal(int number) {
        boolean flag = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = false;
            }
        }

        return flag;
    }
}
