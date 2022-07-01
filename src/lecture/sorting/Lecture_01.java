package src.lecture.sorting;

import java.util.Scanner;

public class Lecture_01 {
    public static void main(String[] args) {

        /**
         * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
         * 정렬하는 방법은 선택정렬입니다.
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

        int index = 0;

        for (int i = 0; i < N; i++) {

            int min = Integer.MAX_VALUE;
            for (int j = i; j < N; j++) {

                if (min > values[j]) {
                    min = values[j];
                    index = j;
                }
            }

            int temp = values[i];
            values[i] = values[index];
            values[index] = temp;

        }

        return values;
    }
}
