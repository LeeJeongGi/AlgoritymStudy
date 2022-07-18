package src.lecture.tree;

import java.util.Scanner;

public class Lecture_02 {

    static String answer = "NO";
    static int N, total = 0;
    static boolean flag = false;

    public static void main(String[] args) {

        /**
         * DFS
         */
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
            total += values[i];
        }

        DFS(0, 0, values);

        System.out.println(answer);
    }
    public static void DFS(int L, int sum, int[] arr) {

        if (flag) {
            return;
        }

        if (sum > total / 2) {
            return;
        }

        if (L == N) {

            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }

        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }
}
