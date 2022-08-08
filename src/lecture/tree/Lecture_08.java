package src.lecture.tree;

import java.util.Scanner;

public class Lecture_08 {

    static int[][] checkMap;

    public static void main(String[] args) {
        /**
         * 조합 경우의 수
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        checkMap = new int[35][35];

        System.out.println(DFS(n, r));
    }

    public static int DFS(int n, int r) {
        if (checkMap[n][r] > 0) {
            return checkMap[n][r];
        }

        if (n == r || r == 0) {
            return 1;
        } else {
            return checkMap[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }
}
