package src.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class GameMap {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        /**
         * 게임 맵 최단거리 구하기
         */
        int[][] maps = {
                {1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}
        };
        System.out.println(solution(maps));
    }

    private static int solution(int[][] maps) {

        int[][] distance = new int[maps.length][maps[0].length];
        int[][] visited = new int[maps.length][maps[0].length];

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0));
        distance[0][0] = 1;
        visited[0][0] = 1;

        while (!queue.isEmpty()) {
            Point temp = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = temp.x + dx[i];
                int nextY = temp.y + dy[i];

                if (0 <= nextX && nextX < maps[0].length && 0 <= nextY && nextY < maps.length && maps[nextX][nextY] == 1 && visited[nextX][nextY] == 0) {
                    queue.offer(new Point(nextX, nextY));
                    distance[nextX][nextY] = distance[temp.x][temp.y] + 1;
                    visited[nextX][nextY] = 1;
                }
            }
        }

        return distance[maps.length - 1][maps[0].length - 1];
    }

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
