package src.lecture.dynamic;

import java.util.Scanner;

public class Lecture_02 {
    public static void main(String[] args) {
        /**
         * 돌다리 건너기
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(solution(N));
    }

    public static int solution(int N) {
        int[] currentLocation = new int[N + 1];

        currentLocation[0] = 1;
        currentLocation[1] = 2;

        for (int i = 2; i <= N; i++) {
            currentLocation[i] = currentLocation[i -1] + currentLocation[i - 2];
        }

        return currentLocation[N];
    }
}
