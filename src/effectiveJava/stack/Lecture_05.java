package src.effectiveJava.stack;

import java.util.Scanner;
import java.util.Stack;

public class Lecture_05 {
    public static void main(String[] args) {

        /**
         * 여러 개의 쇠막대기를 레이저로 절단하려고 한다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고,
         * 레이저를 위에서 수직으로 발사하여 쇠막대기들을 자른다.
         */
        Scanner sc = new Scanner(System.in);
        String input = sc.next();


        System.out.println(solution(input));
    }

    private static int solution(String input) {

        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if ('(' == ch) {
                stack.push(ch);
            } else {
                stack.pop();

                if ('(' == input.charAt(i - 1)) {
                    answer += stack.size();
                } else {
                    answer += 1;
                }
            }
        }

        return answer;
    }
}
