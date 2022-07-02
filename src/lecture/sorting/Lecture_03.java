package src.lecture.sorting;

import java.util.Scanner;

public class Lecture_03 {
    public static void main(String[] args) {

        /**
         * 삽입 정렬
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }

        for (int i : solution(N, values)) {
            System.out.print(i + " ");
        }

    }

    private static int[] solution(int N, int[] values) {

        for (int i = 1; i < N; i++) {

            int temp = values[i], j;
            for (j = i - 1; j >=0; j--) {

                if (values[j] > temp) {
                    values[j + 1] = values[j];
                } else {
                    break;
                }
            }
            values[j + 1] = temp;

        }

        return values;
    }
}
