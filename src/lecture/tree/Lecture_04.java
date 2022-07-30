package src.lecture.tree;

import java.util.Scanner;

public class Lecture_04 {

    static int N, M;
    static int answer = Integer.MIN_VALUE;
    static boolean flag = false;
    public static void main(String[] args) {
        /**
         * 최대점수 구하기(DFS)
         */
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        int[] scores = new int[N];
        int[] times = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
            times[i] = sc.nextInt();
        }
        DFS(0, 0, 0, scores, times);
        System.out.println(answer);
    }

    public static void DFS(int L, int sum, int time, int[] scores, int[] times) {
        if (time > M) {
            return;
        }

        if (L == N) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + scores[L], time + times[L], scores, times);
            DFS(L + 1, sum, time, scores, times);
        }
    }
}
