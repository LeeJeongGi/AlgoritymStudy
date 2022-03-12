package src.lecture.string;

import java.util.Scanner;

public class Lecture_07 {

    private final static String YES = "YES";
    private final static String NO = "NO";

    public static void main(String[] args) {

        /*
        앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
        문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toLowerCase();

        System.out.println(solution(input));
    }

    private static String solution(String input) {

        String answer = YES;

        // 내 풀이
//        String reverseStr = new StringBuilder(input).reverse().toString();
//        if(input.equals(reverseStr)) {
//            answer = YES;
//        } else {
//            answer = NO;
//        }

        // 강의 풀이
        int length = input.length();
        for(int i = 0; i < length/2; i++) {
            if(input.charAt(i) != input.charAt(length - i - 1)) {
                return NO;
            }
        }

        return answer;
    }
}
