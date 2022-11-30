package src.backjun.easy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Number1920 {
    public static void main(String[] args) {
        /**
         * 원하는 정수 찾기
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];

        IntStream.range(0, N)
                .forEach(i -> list[i] = sc.nextInt());

        int M = sc.nextInt();
        int[] find = new int[M];
        IntStream.range(0, M)
                .forEach(i -> find[i] = sc.nextInt());

        int[] answer = new int[M];

        Arrays.sort(list);
        for (int i = 0; i < M; i++) {
            int target = find[i];

            int start = 0;
            int end = N - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                int midValue = list[mid];

                if (midValue > target) {
                    end = mid - 1;
                } else if (midValue < target) {
                    start = mid + 1;
                } else {
                    answer[i] = 1;
                    break;
                }
            }
        }

        IntStream.range(0, M)
                .forEach(i -> System.out.println(answer[i]));
    }
}
