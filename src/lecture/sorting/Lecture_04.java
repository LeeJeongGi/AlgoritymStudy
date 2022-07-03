package src.lecture.sorting;

import java.util.Scanner;

public class Lecture_04 {

    public static void main(String[] args) {

        /**
         * 카카오 문제 - 정렬
         */
        Scanner sc = new Scanner(System.in);

        int cacheSize = sc.nextInt();
        int workCount = sc.nextInt();

        int[] works = new int[workCount];
        for (int i = 0; i < workCount; i++) {
            works[i] = sc.nextInt();
        }

        for (int i : solution(cacheSize, workCount, works)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int cacheSize, int workCount, int[] works) {

        int[] cache = new int[cacheSize];

        for (int i = 0; i < workCount; i++) {

            int currentWork = works[i];

            int position = -1;
            for (int j = 0; j < cacheSize; j++) {
                if (currentWork == cache[j]) {
                    position = j;
                }
            }

            if (position == -1) {

                for (int k = cacheSize - 1; k >= 1; k--) {
                    cache[k] = cache[k - 1];
                }

            } else {

                for (int k = position; k >= 1; k--) {
                    cache[k] = cache[k - 1];
                }

            }
            cache[0] = currentWork;

        }

        return cache;
    }
}
