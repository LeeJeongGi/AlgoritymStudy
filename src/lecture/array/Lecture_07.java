package src.lecture.array;

import java.util.Scanner;

public class Lecture_07 {
    public static void main(String[] args) {

        /**
         * 점수 계산
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] scores = new int[N];

        for(int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }

        System.out.println(solution(N, scores));
    }

    private static int solution(int N, int[] scores) {

        int result = 0;

        int plus = 1;
        for(int i = 0; i < N; i++) {
            if(scores[i] == 1) {
                result = result + plus;
                plus++;
            } else {
                plus = 1;
            }
        }

        return result;
    }
}
