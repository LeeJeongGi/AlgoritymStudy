package src.lecture.stack;

import java.util.Scanner;
import java.util.Stack;

public class Lecture_02 {
    public static void main(String[] args) {
        /**
         * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);

        String  input = sc.next();

        System.out.println(solution(input));
    }

    private static String solution(String input) {

        String answer = "";

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {

            if (ch == ')') {

                while (stack.pop() != '(') {};

            } else {
                stack.push(ch);
            }

        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }

        return answer;
    }
}
