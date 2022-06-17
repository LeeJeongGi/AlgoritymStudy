package src.effectiveJava.stack;

import java.util.Scanner;
import java.util.Stack;

public class Lecture_01 {
    public static void main(String[] args) {

        /**
         * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
         * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
         */
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        System.out.println(solution(input));

    }

    private static String solution(String input) {

        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {

                if (stack.isEmpty()) {
                    answer = "NO";
                    return answer;
                }

                stack.pop();
            }

        }

        if (!stack.isEmpty()) {
            answer = "NO";
        }

        return answer;
    }
}
