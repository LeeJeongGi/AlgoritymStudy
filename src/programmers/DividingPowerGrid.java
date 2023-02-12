package src.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class DividingPowerGrid {
    public static void main(String[] args) {
        /**
         * 전력망 나누기
         *
         * 1. 노드-간선 정보를 저장
         * 2. for 돌면서 하나씩 연결을 제외
         * 3. bfs cnt 를 구한다.
         * 4. 연결을 끊은것을 다시 연결
         * 5. 마지막 차이가 가장 작은것을 출력
         */
        int[][] wires = new int[][] {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        System.out.println(solution(9, wires));
    }

    public static int solution(int n, int[][] wires) {
        int answer = n;

        int[][] graph = new int[n + 1][n + 1];
        for (int i = 0; i < wires.length; i++) {
            graph[wires[i][0]][wires[i][1]] = 1;
            graph[wires[i][1]][wires[i][0]] = 1;
        }

        for (int i = 0; i < wires.length; i++) {
            int first = wires[i][0];
            int second = wires[i][1];

            graph[first][second] = 0;
            graph[second][first]= 0;

            answer = Math.min(answer, bfs(n, first, graph));

            graph[first][second] = 1;
            graph[second][first]= 1;
        }

        return answer;
    }

    private static int bfs(int n, int start, int[][] graph) {
        int count = 1;

        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            visited[temp] = true;

            for (int i = 1; i <= n; i++) {
                if (visited[i]) {
                    continue;
                }

                if (graph[temp][i] == 1) {
                    queue.offer(i);
                    count++;
                }
            }
        }

        return (int) Math.abs(n - 2 * count);
    }
}
