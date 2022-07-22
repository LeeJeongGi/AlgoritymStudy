package src.lecture.graph;

import java.util.Scanner;

public class Lecture_06 {

    static int N;
    static int M;

    static int[][] graph;

    static int[] checkBox;
    static int answer;

    public static void main(String[] args) {
        /**
         * 경로탐색
         */
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        graph = new int[N + 1][N + 1];
        checkBox = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a][b] = 1;
        }

        checkBox[1] = 1;
        DFS(1);
        System.out.println(answer);
    }

    public static void DFS(int v) {

        if (N == v) {
            answer++;
        } else {
            for (int i = 1; i <= N; i++) {
                if (graph[v][i] == 1 && checkBox[i] == 0) {
                    checkBox[i] = 1;
                    DFS(i);

                    checkBox[i] = 0;
                }
            }
        }

    }
}
