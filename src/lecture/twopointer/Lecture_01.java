package src.lecture.twopointer;

import java.util.*;

public class Lecture_01 {
    public static void main(String[] args) {

        /**
         * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] valuesOne = new int[N];
        for (int i = 0; i < N; i++) {
            valuesOne[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] valuesTwo = new int[M];
        for (int i = 0; i < M; i++) {
            valuesTwo[i] = sc.nextInt();
        }

        for (int x : solution(N, M, valuesOne, valuesTwo)) {
            System.out.print(x + " ");
        }
    }

    private static List<Integer> solution(int N, int M, int[] valueOne, int[] valueTwo) {

        List<Integer> answer = new ArrayList<>();

        int p1=0, p2=0;
        while (p1 < N && p2 < M) {
            if (valueOne[p1] < valueTwo[p2]) {
                answer.add(valueOne[p1++]);
            } else {
                answer.add(valueTwo[p2++]);
            }
        }

        while (p1 < N) {
            answer.add(valueOne[p1++]);
        }

        while (p2 < M) {
            answer.add(valueTwo[p2++]);
        }

        return answer;
    }
}
