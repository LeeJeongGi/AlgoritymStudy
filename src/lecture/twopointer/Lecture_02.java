package src.lecture.twopointer;

import java.util.*;

public class Lecture_02 {
    public static void main(String[] args) {

        /**
         * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요
         */
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int[] valuesA = new int[A];
        for (int i = 0; i < A; i++) {
            valuesA[i] = sc.nextInt();
        }

        int B = sc.nextInt();
        int[] valuesB = new int[B];
        for (int i = 0; i < B; i++) {
            valuesB[i] = sc.nextInt();
        }

        ArrayList<Integer> results = solution(A, B, valuesA, valuesB);
        for (Integer result : results) {
            System.out.print(result + " ");
        }

    }

    private static ArrayList solution(int A, int B, int[] valuesA, int[] valuesB) {

        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(valuesA);
        Arrays.sort(valuesB);

        int pointA = 0;
        int pointB = 0;
        while (pointA < A && pointB < B) {

            if (valuesA[pointA] < valuesB[pointB]) {
                pointA++;
            } else if (valuesA[pointA] > valuesB[pointB]) {
                pointB++;
            } else {
                answer.add(valuesA[pointA++]);
                pointB++;
            }
        }

        return answer;
    }
}
