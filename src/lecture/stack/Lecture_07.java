package src.lecture.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lecture_07 {
    public static void main(String[] args) {

        /**
         * 교육과정 설계
         */
        Scanner sc = new Scanner(System.in);
        String condition = sc.next();
        String input = sc.next();


        System.out.println(solution(condition, input));
    }

    private static String solution(String condition, String input) {

        String answer = "YES";

        Queue<Character> conditionQ = new LinkedList<>();

        for (char ch : condition.toCharArray()) {
            conditionQ.offer(ch);
        }

        for (char ch : input.toCharArray()) {

            if (conditionQ.contains(ch)) {
                if (conditionQ.poll() != ch) {
                    return "NO";
                }
            }
        }
        if (!conditionQ.isEmpty()) {
            return "NO";
        }

        return answer;
    }
}
