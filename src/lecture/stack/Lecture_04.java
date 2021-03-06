package src.lecture.stack;

import java.util.Scanner;
import java.util.Stack;

public class Lecture_04 {
    public static void main(String[] args) {

        /**
         * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
         * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
         */
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));

    }

    private static int solution(String input) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : input.toCharArray()) {

            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();

                if (x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }
        }
        answer = stack.pop();

        return answer;
    }
}
