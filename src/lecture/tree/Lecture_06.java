package src.lecture.tree;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lecture_06 {

    static int N;
    static int answer = Integer.MAX_VALUE;
    static int price;

    public static void main(String[] args) {
        /**
         * DFS - 동전 교환
         */
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Integer[] coins = new Integer[N];

        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }
        Arrays.sort(coins, Collections.reverseOrder());

        price = sc.nextInt();

        DFS(0, 0, coins);
        System.out.println(answer);
    }

    public static void DFS(int L, int sum, Integer[] coins) {

        if (sum > price) {
            return;
        }

        if (L > answer) {
            return;
        }

        if (sum == price) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < N; i++) {
                DFS(L + 1, sum + coins[i], coins);
            }
        }
    }
}
