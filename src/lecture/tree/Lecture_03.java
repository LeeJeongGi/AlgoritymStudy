package src.lecture.tree;

import java.util.Scanner;

public class Lecture_03 {

    static int answer = Integer.MIN_VALUE;
    static int C, N;
    public static void main(String[] args) {

        /**
         * DFS(바둑이 승차)
         */
        Scanner sc = new Scanner(System.in);

        C = sc.nextInt();
        N = sc.nextInt();

        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }

        DFS(0, 0, values);

        System.out.println(answer);
    }

    public static void DFS(int L, int sum, int[] values) {

        if (sum > C) {
            return;
        }

        if (L == N) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + values[L], values);
            DFS(L + 1, sum, values);

        }
    }
}
