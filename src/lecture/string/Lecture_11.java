package src.lecture.string;

import java.util.Scanner;

public class Lecture_11 {
    public static void main(String[] args) {
        /**
         * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
         * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
         */
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(solution(input));
    }

    private static String  solution(String input) {

        String answer = "";

        input = input + " ";
        int count = 1;

        for(int i = 0; i < input.length() - 1; i++) {

            char first = input.charAt(i);
            char second = input.charAt(i+1);

            if(first == second) {
                count++;
            } else {
                answer += input.charAt(i);

                if(count > 1) {
                    answer += String.valueOf(count);
                }
                count = 1;
            }

        }

        return answer;
    }
}
