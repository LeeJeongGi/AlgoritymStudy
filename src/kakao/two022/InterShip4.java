package src.kakao.two022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class InterShip4 {

    static ArrayList<Node>[] graph;

    public static void main(String[] args) {
        /**
         * 등산코스 정하기
         */
        int n = 5;
        int[][] paths = {{1, 3, 10}, {1, 4, 20}, {2, 3, 4}, {2, 4, 6}, {3, 5, 20}, {4, 5, 6}};
        int[] gates = {1, 2};
        int[] summits = {5};

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < paths.length; i++) {
            int start = paths[i][0];
            int end = paths[i][1];
            int time = paths[i][2];

            // 출입구일 경우 다른 곳으로만 갈 수 있는 단방향
            // 산봉우리일 경우 특정 한 곳에서 산봉우리로 가는 단방향
            if (isGate(start, gates) || isSummit(end, summits)) {
                graph[start].add(new Node(end, time));
            } else if (isGate(end, gates) || isSummit(start, summits)) {
                graph[end].add(new Node(start, time));
            } else {
                // 일반 등산로일 경우 양방향
                graph[start].add(new Node(end, time));
                graph[end].add(new Node(start, time));
            }
        }
        // 정상까지 갔을 때 최소이면 돌아올 때도 같은 경로를 선택하면 되므로
        // 정상까지 가는 경우만 고려
        int[] answer =  dijkstra(n, gates, summits);
        IntStream.range(0, answer.length).forEach(i -> System.out.print(answer[i] + " "));
    }

    public static int[] dijkstra(int n, int[] gates, int[] summits) {
        Queue<Node> qu = new LinkedList<>();
        int[] intensity = new int[n + 1];

        Arrays.fill(intensity, Integer.MAX_VALUE);

        // 출입구 전부를 큐에 넣음
        for (int gate : gates) {
            qu.add(new Node(gate, 0));
            intensity[gate] = 0; // 시작 지점은 0
        }

        while (!qu.isEmpty()) {
            Node cn = qu.poll();

            // 현재의 가중치가 저장된 가중치보다 커서 최소 갱신이 되지 않을 때 스킵
            if(cn.time > intensity[cn.node]) continue;

            for (int i = 0; i < graph[cn.node].size(); i++) {
                Node nn = graph[cn.node].get(i);

                // 최소 갱신
                int dis = Math.max(intensity[cn.node], nn.time);
                if (intensity[nn.node] > dis) {
                    intensity[nn.node] = dis;
                    qu.add(new Node(nn.node, dis));
                }
            }
        }

        int mn = Integer.MAX_VALUE; // 산봉우리 번호
        int mw = Integer.MAX_VALUE; // 최솟값

        // 정렬하지 않으면 12, 14, 15, 16, 17, 25번 문제 실패
        Arrays.sort(summits);

        for (int summit : summits) {
            if (intensity[summit] < mw) {
                mn = summit;
                mw = intensity[summit];
            }
        }

        return new int[]{mn, mw};
    }

    // num이 입구인지 확인
    private static boolean isGate(int num, int[] gates) {
        for (int gate : gates) {
            if (num == gate) return true;
        }
        return false;
    }

    // num이 산봉우리인지 확인
    private static boolean isSummit(int num, int[] submits) {
        for (int submit : submits) {
            if (num == submit) return true;
        }
        return false;
    }

    public static class Node {
        int node;
        int time;

        public Node(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }
}
