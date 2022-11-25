package src.backjun.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class Number13023 {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static boolean arrive;

    public static void main(String[] args) {
        /**
         * 친구 관계 파악하기
         * 1. 깊이가 5일 경우 1 출력 아니면 0 출력
         * 2. Dfs로 깊이를 조사하면 될 것 같다.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        visited = new boolean[N];
        graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int node = sc.nextInt();
            int edge = sc.nextInt();

            graph[node].add(edge);
            graph[edge].add(node);
        }

        for (int i = 0; i < N; i++) {
            DFS(i, 1);

            if (arrive) {
                break;
            }
        }

        if (arrive) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void DFS(int now, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }

        visited[now] = true;
        for (int i : graph[now]) {
            if (!visited[i]) {
                DFS(i, depth + 1);
            }
        }

        visited[now] = false;
    }
}
