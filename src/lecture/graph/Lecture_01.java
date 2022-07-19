package src.lecture.graph;

import java.util.Scanner;

public class Lecture_01 {
    public static void main(String[] args) {

        /**
         * 재귀 함수
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        DFS(N);
    }

    public static void DFS(int N) {

        if (N == 0) {
            return;
        } else {
            DFS(N - 1);
            System.out.print(N + " ");
        }
    }
}
