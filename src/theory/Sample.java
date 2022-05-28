package src.theory;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {

        /**
         * 코딩 테스트 복습하는 연습장
         */

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] valuesA = new int[N];
        for (int i = 0; i < N; i++) {
            valuesA[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] valuesM = new int[M];
        for (int i = 0; i < M; i++) {
            valuesM[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();
        answer = solution(N, M, valuesA, valuesM);
        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }

    }

    private static ArrayList<Integer> solution(int N, int M, int[] valuesA, int[] valuesB) {

        ArrayList<Integer> answer = new ArrayList<>();

        int pointA = 0, pointB = 0;
        while (pointA < N && pointB < M) {

            if (valuesA[pointA] <= valuesB[pointB]) {
                answer.add(valuesA[pointA++]);
            } else {
                answer.add(valuesB[pointB++]);
            }
        }

        while (pointA < N) {
            answer.add(valuesA[pointA++]);
        }

        while (pointB < M) {
            answer.add(valuesB[pointB++]);
        }

        return answer;
    }
}
