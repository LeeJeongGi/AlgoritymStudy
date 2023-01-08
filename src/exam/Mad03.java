package src.exam;

import java.util.ArrayList;

public class Mad03 {

    static boolean[][] cache;
    static int[][] board;

    static int time = 0;

    static ArrayList<ArrayList<ItemInfo>> temp = new ArrayList<>();
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int maxTip = Integer.MIN_VALUE;

    static int[][] times;
    static int[][] costs;

    public static void main(String[] args) {
        int r = 3;
        int[][] delivery = {
                {1, 5}, {8, 3}, {4, 2},
                {2, 3}, {3, 1}, {3, 2},
                {4, 2}, {5, 2}, {4, 1}
        };

        times = new int[r][r];
        costs = new int[r][r];

        for (int i = 0; i < delivery.length; i++) {
            int tempTime = delivery[i][0];
            int tempCost = delivery[i][1];


        }

//        for (int i = 0; i < delivery.length; i++) {
//            int tempTime = delivery[i][0];
//            int tempCost = delivery[i][1];
//            System.out.println("i = " + i);
//
//            System.out.println("tempTime = " + tempTime);
//            System.out.println("tempCost = " + tempCost);
//        }

//        for (int i = 0; i < delivery.length; i++) {
//            temp.add(new ArrayList<>());
//        }
//
//        for (int i = 0; i < delivery.length; i++) {
//            int tempTime = delivery[i][0];
//            int tempCost = delivery[i][1];
//
//            temp.get(i).add(new ItemInfo(tempTime, tempCost));
//        }
//
//        cache = new boolean[r][r];
//        cache[0][0] = true;
//        maxTip = delivery[0][1];
//        DFS(0, 0, r);
//
//        System.out.println("maxTip = " + maxTip);
    }

    public static void DFS(int x, int y, int r) {
        for (int i = 0; i < 4; i++) {

            time++;

            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (0 <= nextX && 0 <= nextY && nextX < r && nextY < r && !cache[nextX][nextY]) {
                cache[nextX][nextY] = true;
                ItemInfo tempItem = temp.get(nextX).get(nextY);
                if (time >= tempItem.time) {
                    maxTip += tempItem.cost;
                }

                DFS(nextX, nextY, r);
            }
        }
    }

    public static class ItemInfo {
        int time;
        int cost;

        public ItemInfo(int time, int cost) {
            this.time = time;
            this.cost = cost;
        }
    }
}
