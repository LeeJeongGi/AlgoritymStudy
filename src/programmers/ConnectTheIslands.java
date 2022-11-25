package src.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class ConnectTheIslands {

    static int[] unf;
    static int answer = 0;

    public static void main(String[] args) {
        int n = 4;
        int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};

        unf = new int[n];
        for (int i = 0; i < n; i++) {
            unf[i] = i;
        }
        ArrayList<iLand> iLands = new ArrayList<>();

        for (int i = 0; i < costs.length; i++) {
            int start = costs[i][0];
            int end = costs[i][1];
            int cost = costs[i][2];

            iLands.add(new iLand(start, end, cost));
        }

        Collections.sort(iLands);
        for (iLand iLand : iLands) {
            int a = find(iLand.start);
            int b = find(iLand.end);

            if (a != b) {
                answer += iLand.cost;
                union(a, b);
            }
        }
        System.out.println("answer = " + answer);
    }

    public static void union(int a, int b) {
        int first = find(a);
        int second = find(b);

        if (first != second) {
            unf[first] = second;
        }
    }

    public static int find(int a) {
        if(a == unf[a]) return unf[a];
        else return unf[a] = find(unf[a]);
    }

    public static class iLand implements Comparable<iLand> {
        int start;
        int end;
        int cost;

        public iLand(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(iLand o) {
            return this.cost - o.cost;
        }
    }
}
