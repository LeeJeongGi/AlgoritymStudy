package src.lecture.tree;

import java.util.Scanner;

public class Lecture_09 {

    static int[] b,p,ch;
    static int n,f;
    static boolean flag = false;
    static int[][] dy = new int[35][35];

    public static void main(String[] args) {
        /**
         * 수열 예측하기
         */
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();

        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];

        for (int i = 0; i < n; i++) {
            b[i] = combination(n - 1, i);
        }

        DFS(0, 0);
    }

    public static int combination(int n, int r) {

        if (dy[n][r] > 0) {
            return dy[n][r];
        }

        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }

    public static void DFS(int L, int sum) {
        if (flag) {
            return;
        }

        if (L == n) {
            if (sum == f) {
                for (int x : p) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }
}
