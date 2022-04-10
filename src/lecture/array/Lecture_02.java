package src.lecture.array;

import java.util.Scanner;

public class Lecture_02 {
    public static void main(String[] args) {

        /**
         * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
         * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.
         */
        Scanner sc = new Scanner(System.in);

        int numberOfPeople = sc.nextInt();
        int[] people = new int[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            people[i] = sc.nextInt();
        }

        System.out.println(solution(numberOfPeople, people));
    }

    private static int solution(int numberOfPeople, int[] people) {

        int answer = 0;

        int min = people[0];
        for (int i = 1; i < numberOfPeople; i++) {
            if(people[i] > people[i-1]) {
                answer++;
                min = people[i];
            }
        }

        return answer;
    }
}
