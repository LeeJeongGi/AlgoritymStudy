package src.lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture_10 {
    public static void main(String[] args) {

        /**
         * 마구간 결정하기
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();

        int[] location = new int[N];
        for (int i = 0; i < N; i++) {
            location[i] = sc.nextInt();
        }

        System.out.println(solution(N, C, location));

    }

    private static int solution(int n, int c, int[] location) {

        int answer = 0;

        Arrays.sort(location);

        int lt = 1;
        int rt = location[n - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(location, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid -1;
            }
        }

        return answer;
    }

    private static int count(int[] location, int dist) {

        int cnt = 1;
        int ep = location[0];

        for (int i = 0; i < location.length; i++) {
            if (location[i] - ep >= dist) {
                cnt++;
                ep = location[i];
            }
        }
        return cnt;
    }
}
