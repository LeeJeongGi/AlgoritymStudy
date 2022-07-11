package src.lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture_09 {
    public static void main(String[] args) {

        /**
         * 뮤직비디오(결정알고리즘)
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }

        System.out.println(solution(N,M,values));

    }

    private static int solution(int N, int M, int[] values) {

        int answer = 0;

        int lt = Arrays.stream(values).max().getAsInt();
        int rt = Arrays.stream(values).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(values, mid) <= M) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    private static int count(int[] values, int capacity) {

        int cnt = 1, sum = 0;

        for (int value : values) {
            if (sum + value > capacity) {
                cnt++;
                sum = value;
            } else {
                sum += value;
            }
        }

        return cnt;
    }
}
