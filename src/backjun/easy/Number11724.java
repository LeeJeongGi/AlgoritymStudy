package src.backjun.easy;

import java.util.Scanner;

public class Number11724 {

    static int[][] values = new int[1001][1001];
    static boolean[] visited = new boolean[1001];
    static int N, M;

    public static void main(String[] args) {

        /**
         * 연결 요소의 개수
         */
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            values[u][v] = values[v][u] = 1;
        }

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        System.out.print(answer);
    }

    public static void dfs(int node) {
        if (visited[node]) {
            return;
        }

        visited[node] = true;
        for (int i = 1; i <= N; i++) {
            if (values[node][i] == 1) {
                dfs(i);
            }
        }
    }
}
