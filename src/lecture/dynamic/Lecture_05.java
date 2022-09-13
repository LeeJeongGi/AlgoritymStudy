package src.lecture.dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture_05 {

    static int[] cash;

    public static void main(String[] args) {
        /**
         * 동전교환(냅색 알고리즘)
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] coin = new Integer[N];
        for (int i = 0; i < N; i++) {
            coin[i] = sc.nextInt();
        }
        int total = sc.nextInt();
        cash = new int[total + 1];

        System.out.println(solution(coin, total));
    }

    private static int solution(Integer[] coin, int total) {

        Arrays.fill(cash, Integer.MAX_VALUE);
        cash[0] = 0;

        for (int i = 0; i < coin.length; i++) {
            int currentCoin = coin[i];

            for (int j = coin[i]; j <= total; j++) {
                cash[j] = Math.min(cash[j], cash[j - coin[i]] + 1);
            }
        }

        return cash[total];
    }
}
