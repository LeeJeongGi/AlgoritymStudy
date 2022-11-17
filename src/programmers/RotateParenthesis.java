package src.programmers;

import java.util.Stack;

public class RotateParenthesis {
    public static void main(String[] args) {
        /**
         * 괄호 회전하기.
         * 1.문자 s가 주어질 때 0 <= x < s.length 만큼 회전 하면서
         * 2.올바른 괄호 인지 체크 후 올바른 괄호가 몇개 인지 리턴하는 문제.
         * 3.대,중,소 괄호가 있어서 올바른 괄호 인지 판단하면 되는데... 스택으로 확인을 순환하면서 하면 될듯
         */
        String s = "[)(]";
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String temp = move(s, i);

            if (check(temp)) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    public static String move(String s, int index) {
        String result = "";

        result = s.substring(index).concat(s.substring(0, index));

        return result;
    }

    public static boolean check(String s) {
        boolean flag = true;
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if ('{' == ch || '[' == ch || '(' == ch) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                }

                Character temp = stack.pop();
                if (temp == '[' && ch != ']') {
                    flag = false;
                    break;
                } else if (temp == '{' && ch != '}') {
                    flag = false;
                    break;
                } else if (temp == '(' && ch != ')') {
                    flag = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            flag = false;
        }

        return flag;
    }
}
