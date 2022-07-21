package src.lecture.graph;

import java.util.Scanner;

public class Lecture_05 {

    static int N;
    static int[] ch;

    public static void main(String[] args) {

        /**
         * 이진 트리
         */
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ch = new int[N + 1];

        DFS(1);

    }

    public static void DFS(int L) {

        if (L == N + 1) {
            String temp = "";
            for (int i = 1; i <= N; i++) {
                if (ch[i] == 1) {
                    temp += (i + " ");
                }
            }

            if (temp.length() > 0) {
                System.out.println(temp);
            }

        } else {

            ch[L] = 1;
            DFS(L + 1);

            ch[L] = 0;
            DFS(L + 1);
        }

    }

}
