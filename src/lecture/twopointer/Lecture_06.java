package src.lecture.twopointer;

import java.util.Scanner;

public class Lecture_06 {
    public static void main(String[] args) {

        /**
         * 최대 길이 연속부분 수열
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }

        System.out.println(solution(N,K,values));
    }

    private static int solution(int N, int K, int[] values) {

        int answer = 0;

        int lt = 0;
        int cnt = 0;
        for (int rt = 0; rt < N; rt++) {

            if (values[rt] == 0) {
                cnt++;
            }

            while (cnt > K) {
                if (values[lt] == 0) {
                    cnt--;
                }
                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }
}
