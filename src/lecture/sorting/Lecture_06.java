package src.lecture.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lecture_06 {
    public static void main(String[] args) {

        /**
         * 새 학기가 시작되었습니다. 철수는 새 짝꿍을 만나 너무 신이 났습니다.
         *
         * 철수네 반에는 N명의 학생들이 있습니다.
         * 선생님은 반 학생들에게 반 번호를 정해 주기 위해 운동장에 반 학생들을 키가 가장 작은 학생부터 일렬로 키순으로 세웠습니다.
         * 제일 앞에 가장 작은 학생부터 반 번호를 1번부터 N번까지 부여합니다. 철수는 짝꿍보다 키가 큽니다.
         * 그런데 철수가 앞 번호를 받고 싶어 짝꿍과 자리를 바꿨습니다.
         * 선생님은 이 사실을 모르고 학생들에게 서있는 순서대로 번호를 부여했습니다.
         * 철수와 짝꿍이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때 철수가 받은 번호와 철수 짝꿍이 받은 번호를
         * 차례로 출력하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] students = new int[N];
        for (int i = 0; i < N; i++) {
            students[i] = sc.nextInt();
        }

        for (int i : solution(N, students)) {
            System.out.print(i + " ");
        }

    }

    private static ArrayList<Integer> solution(int N, int[] students) {

        ArrayList<Integer> answer = new ArrayList<>();

        int[] copyStudents = students.clone();
        Arrays.sort(copyStudents);

        for (int i = 0; i < N; i++) {

            if (students[i] != copyStudents[i]) {
                answer.add(i + 1);
            }

        }

        return answer;
    }
}
