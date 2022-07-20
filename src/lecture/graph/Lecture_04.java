package src.lecture.graph;

import java.util.Scanner;

public class Lecture_04 {

    static int[] fiboMemo;

    public static void main(String[] args) {
        /**
         * 피보나치 수열
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        fiboMemo = new int[N + 1];
        fiboMemo[1] = 1;
        fiboMemo[2] = 1;

        DFS(N);

        for (int i = 1; i <= N; i++) {
            System.out.print(fiboMemo[i] + " ");
        }
    }

    public static int DFS(int N) {

        if (fiboMemo[N] > 0) {
            return fiboMemo[N];
        }

        if (N == 1) {
            return fiboMemo[N] = 1;
        } else if (N == 2) {
            return fiboMemo[N] = 1;
        } else {
            return fiboMemo[N] =  DFS(N - 2) + DFS(N - 1);
        }
    }
}
