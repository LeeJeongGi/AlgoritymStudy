package src.lecture.sorting;

import java.util.Scanner;

public class Lecture_02 {
    public static void main(String[] args) {

        /**
         * 버블 정렬
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

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {

                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j + 1] = temp;
                }

            }
        }

        return values;
    }
}
