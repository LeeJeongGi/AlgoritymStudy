package src.theory;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Sample {
    public static void main(String[] args) {

        /**
         * 코딩 테스트 복습하는 연습장
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] cache = new int[N + 1];
        IntStream.range(0, N).forEach(i -> cache[i] = sc.nextInt());

        int[] distance = new int[N + 1];

        distance[0] = 1;
        for (int i = 1; i < N; i++) {

            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (cache[i] > cache[j] && distance[j] > max) {
                    max = distance[j];
                }
            }

            distance[i] = max + 1;
        }


        int answer = Arrays.stream(distance).max().getAsInt();

        System.out.println(answer);
    }
}
