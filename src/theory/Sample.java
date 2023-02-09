package src.theory;

import java.util.ArrayList;
import java.util.HashMap;

public class Sample {

    static int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    public static void main(String[] args) {

        /**
         * 코딩 테스트 복습하는 연습장
         */
        int[] answer = {1, 3, 2, 4, 2};
        System.out.println(solution(answer));
    }

    public static int[] solution(int[] answers) {

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < patterns.length; i++) {
            students.add(new Student(i + 1, patterns[i]));
        }

        // 정답 갯수 계산
        for (int i = 0; i < students.size(); i++) {
            Student tempStudent = students.get(i);
            tempStudent.calculatorAnswerCount(answers, tempStudent.pattern);
        }

        // 최댓값 구하기
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < students.size(); i++) {
            Student tempStudent = students.get(i);
            maxValue = Math.max(maxValue, tempStudent.answerCount);
        }

        // 정답을 가장 많이 맞춘 학생 저장
        ArrayList<Integer> tempAnswer = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student tempStudent = students.get(i);
            if (maxValue == tempStudent.answerCount) {
                tempAnswer.add(tempStudent.number);
            }
        }

        int[] answer = tempAnswer.stream().mapToInt(integer -> integer).toArray();
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();

        return answer;
    }

    private static class Student {
        int number;
        int[] pattern;

        int answerCount;

        public Student(int number, int[] pattern) {
            this.number = number;
            this.pattern = pattern;
            this.answerCount = 0;
        }

        public void calculatorAnswerCount(int[] answers, int[] tempPattern) {
            int tempCount = 0;

            int answerOfLength = answers.length;
            int patternOfLength = tempPattern.length;

            int index = 0;
            while (index < answerOfLength) {
                if (answers[index] == tempPattern[index % patternOfLength]) {
                    tempCount++;
                }
                index++;
            }

            this.answerCount = tempCount;
        }
    }

}
