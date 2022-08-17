package src.lecture.dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecture_06 {

    static int n,m,len, answer = Integer.MAX_VALUE;
    static int[] combination;
    static ArrayList<Point> pizza, house;

    public static void main(String[] args) {
        /**
         * 피자 배달 거리
         */
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        pizza = new ArrayList<>();
        house = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                if (temp == 1) {
                    house.add(new Point(i, j));
                } else if (temp == 2) {
                    pizza.add(new Point(i, j));
                }
            }
        }

        len = pizza.size();
        combination = new int[m];
        DFS(0, 0);
        System.out.println(answer);
    }

    public static void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point h : house) {
                int dis = Integer.MAX_VALUE;
                for (int i : combination) {
                    dis = Math.min(dis, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combination[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
