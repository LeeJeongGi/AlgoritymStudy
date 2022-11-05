package src.programmers;

import java.util.Stack;

public class RemoveByPair {
    public static void main(String[] args) {
        /**
         * 짝지어 제거하기
         * 1.연속된 같은 문자 2개씩 제거하여
         *   모두 제거되는지 판별 후 1 또는 0을 리턴한다.
         * 2.접근 ! 스택으로 접근하면 될 것 같다는 생각이 들었다.
         * 3.문자열의 길이는 1,000,000 이기 때문에 복잡도는 N 이여야 된다.
         * 4.모든 작업이 마친 후 스택이 비어있는지 ? 검증! 안되면 다른 방법 찾아보기....
         */
        String s = "cdcd";

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != ch) {
                stack.add(ch);
            } else if (stack.peek() == ch) {
                stack.pop();
            }

        }

        if (stack.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
