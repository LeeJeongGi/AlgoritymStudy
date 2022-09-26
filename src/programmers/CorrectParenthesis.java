package src.programmers;


import java.util.Stack;

public class CorrectParenthesis {
    public static void main(String[] args) {
        /**
         * 괄호 채우기
         */
        String s = "(()(";

        // 슈도 코드
        // 스택에 '(' 일 경우 넣고 ')'이거 일 경우 뺀다.
        // 스택이 비었는데 ')' 이게 들어가면 false
        // 작업이 모두 끝났는데 스택이 비어있으면 true, 그렇지 않으면 false
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if ('(' == ch) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                }

                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            answer = false;
        }

        System.out.println("answer = " + answer);
    }
}
