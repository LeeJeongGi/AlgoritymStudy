package src.lecture.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecture_07 {

    static int N,M,answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public static void main(String[] args) {

        /**
         * 경로 탐색(인접리스트)
         */
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
        }

        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }

    public static void DFS(int V) {

        if (V == N) {
            answer++;
        } else {
            for (int nv : graph.get(V)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }

    }
}
