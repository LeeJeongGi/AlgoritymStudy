package src.lecture.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lecture_08 {

    static int N,M = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public static void main(String[] args) {
        /**
         * 그래프 최단거리(BFS)
         */
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[N + 1];
        dis = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
        }

        ch[1] = 1;
        BFS(1);

        for (int i = 2; i <= N; i++) {
            System.out.print(dis[i]);
        }
    }

    public static void BFS(int V) {

        Queue<Integer> queue = new LinkedList<>();
        ch[V] = 1;
        dis[V] = 0;

        queue.offer(V);
        while (!queue.isEmpty()) {
            int cv = queue.poll();

            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }
}
