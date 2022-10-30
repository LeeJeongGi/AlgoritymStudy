package src.programmers;

import java.util.Scanner;
import java.util.stream.IntStream;

public class RepresentationOfNumbers {
    public static void main(String[] args) {
        /**
         * 연속된 자연수로 숫자 표현하기
         * 1.15라는 숫자를 표현할 때
         *  1 + 2 + 3 + 4 + 5
         *  4 + 5 + 6
         *  7 + 8
         *  15
         *  총 4가지 방법이 있다.
         *  내 생각엔 투포인터 알골리즘으로 푼다면 해결할 수 있을 듯
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cache = new int[N + 1];

        IntStream.rangeClosed(1, N)
                .forEachOrdered(i -> cache[i] = i);

        int answer = 0;
        int sum = 0;
        int leftIndex = 1;

        for (int i = 1; i <= N; i++) {
            sum += cache[i];

            if (sum == N) {
                answer++;
            }

            while (sum >= N) {
                sum -= cache[leftIndex++];
                if (sum == N) {
                    answer++;
                }
            }
        }

        System.out.println("answer = " + answer);

    }
}
