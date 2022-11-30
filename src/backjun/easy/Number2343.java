package src.backjun.easy;

import java.util.Scanner;

public class Number2343 {
    public static void main(String[] args) {
        /**
         * 블루레이 만들기
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int start = 0;
        int end = 0;

        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            times[i] = sc.nextInt();

            if (start < times[i]) {
                start = times[i];
            }

            end = end + times[i];
        }

        while (start <= end) {
            int midIndex = (start + end) / 2;

            int sum = 0;
            int count = 0;
            for (int i = 0; i < N; i++) {
                int time = times[i];

                if (sum + time > midIndex) {
                    count++;
                    sum = 0;
                }
                sum = sum + time;
            }

            if (sum != 0) {
                count++;
            }

            if (count > M) {
                start = midIndex + 1;
            } else  {
                end = midIndex - 1;
            }
        }
        System.out.println(start);
    }
}
