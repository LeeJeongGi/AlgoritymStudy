package src.lecture.dynamic;

import java.util.Scanner;

public class Lecture_06 {
    public static void main(String[] args) {
        /**
         * 최대점수 구하기(냅색 알고리즘)
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dy = new int[m + 1];

        for (int i = 0; i < n; i++) {
            int ps = sc.nextInt();
            int pt = sc.nextInt();

            for (int j = m; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }

        System.out.println(dy[m]);
    }
}
