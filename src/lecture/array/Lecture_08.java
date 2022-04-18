package src.lecture.array;

import java.util.Scanner;

public class Lecture_08 {
    public static void main(String[] args) {

        /**
         * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
         * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
         * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
         */
        Scanner sc = new Scanner(System.in);

        int studentCount = sc.nextInt();
        int[] scores = new int[studentCount];
        for (int i = 0; i < studentCount; i++) {
            scores[i] = sc.nextInt();
        }

        for (int score : solution(studentCount, scores)) {
            System.out.print(score + " ");
        }

    }

    private static int[] solution(int studentCount, int[] scores) {
        int[] result = new int[studentCount];

        for (int i = 0; i < studentCount; i++) {
            int count = 1;
            for(int j = 0; j < studentCount; j++) {
                if(scores[i] < scores[j]) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }
}
