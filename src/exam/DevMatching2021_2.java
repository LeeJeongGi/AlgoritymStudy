package src.exam;

import java.util.Arrays;

public class DevMatching2021_2 {

    static int[][] map;

    static int[][] copyMap;
    static int minValue = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};

        map = new int[rows + 1][columns + 1];
        copyMap = new int[rows + 1][columns + 1];
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                map[i][j] = number++;
                copyMap[i][j] = map[i][j];
            }
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int startX = queries[i][0];
            int startY = queries[i][1];
            int endX = queries[i][2];
            int endY = queries[i][3];

            minValue = Integer.MAX_VALUE;

            rightMove(startX, startY, endY);
            downMove(endY, startX, endX);
            leftMove(endX, startY, endY);
            upMove(startY, startX, endX);

            answer[i] = minValue;
            System.out.println("minValue = " + minValue);

            mapSynchronization(startX, endX, startY, endY);
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    public static void rightMove(int x, int startY, int endY) {

        for (int i = startY + 1; i <= endY; i++) {
            copyMap[x][i] = map[x][i - 1];
            minValue = Math.min(minValue, map[x][i - 1]);
        }
    }

    public static void leftMove(int x, int startY, int endY) {

        for (int i = endY; i>= startY + 1; i--) {
            copyMap[x][i - 1] = map[x][i];
            minValue = Math.min(minValue, map[x][i]);
        }
    }

    public static void downMove(int y, int startX, int endX) {

        for (int i = startX + 1; i <= endX; i++) {
            copyMap[i][y] = map[i - 1][y];
            minValue = Math.min(minValue, map[i - 1][y]);
        }
    }

    public static void upMove(int y, int startX, int endX) {

        for (int i = endX; i >= startX + 1; i--) {
            copyMap[i - 1][y] = map[i][y];
            minValue = Math.min(minValue, map[i][y]);
        }
    }

    public static void mapSynchronization(int startX, int endX, int startY, int endY) {

        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                map[i][j] = copyMap[i][j];
            }
        }
    }
}
