package src.lecture.graph;

import java.util.Scanner;

public class Lecture_03 {

    public static void main(String[] args) {

        /**
         * 피보나치 수열
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(DFS(N));
    }

    public static int DFS(int N) {

        if (N == 1) {
            return 1;
        } else {
            return N * DFS(N - 1);
        }

    }
}
