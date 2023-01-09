package src.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class PickUpItem {

    static int[][] map = new int[101][101];

    static int[] dx = {-1, 1, 0, 0};

    static int[] dy = {0, 0, 1, -1};

    static int answer = 0;

    public static void main(String[] args) {
        /**
         * 직사각형 그려서 최단거리 찾는법...
         */
        int[][] rectangle = {{2, 2, 5, 5}, {1, 3, 6, 4}, {3, 1, 4, 6}};
        int characterX = 1;
        int characterY = 4;
        int itemX = 6;
        int itemY = 3;

        characterX *= 2;
        characterY *= 2;
        itemX *= 2;
        itemY *= 2;

        // 직사각형 최대 크기는 50까지.
        int[][] board = new int[102][102];
        for (int i = 0; i < rectangle.length; i++) {
            int preX = 2 * rectangle[i][0];
            int preY = 2 * rectangle[i][1];
            int postX = 2 * rectangle[i][2];
            int postY = 2 * rectangle[i][3];

            fillMap(preX, preY, postX, postY);
        }

        bfs(characterX, characterY, itemX, itemY);

        System.out.println("answer = " + answer / 2);
    }

    private static void bfs(int characterX, int characterY, int itemX, int itemY) {
        boolean[][] visited = new boolean[102][102];
        Queue<Point> queue = new LinkedList<>();
        visited[characterX][characterY] = true;
        queue.add(new Point(characterX, characterY));

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            if (point.x == itemX && point.y == itemY) { //목표점 도달
                answer = Math.min(answer, map[point.x][point.y]);
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];

                if (!checkDomain(nextX, nextY)) {
                    continue;
                }

                if (visited[nextX][nextY] || map[nextX][nextY] != 1) {
                    continue;
                }

                visited[nextX][nextY] = true;
                map[nextX][nextY] = map[point.x][point.y] + 1;

                queue.add(new Point(nextX, nextY));
            }
        }
    }

    private static boolean checkDomain(int nextX, int nextY) {
        return 0 < nextX && nextX <= 100 && 0 < nextY && nextY <= 100;
    }

    public static void fillMap(int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if(map[i][j]==103) {
                    continue;
                }

                map[i][j]=103;

                if (i == x1 || i == x2 || j == y1 || j == y2) {
                    map[i][j] = 1;
                }
            }
        }
    }

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
