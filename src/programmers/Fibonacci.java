package src.programmers;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Fibonacci {
    public static void main(String[] args) {
        /**
         * 피보나치 수열
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(solution(N));
    }

    private static int solution(int N) {

        int answer = 0;

        int[] cache = new int[N + 1];
        cache[0] = 0;
        cache[1] = 1;

        IntStream.rangeClosed(2, N)
                .forEach(i -> cache[i] = (cache[i - 1] + cache[i - 2]) % 1234567);

        answer = cache[N];

        return answer;
    }
}
