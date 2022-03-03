package src.lecture.string;

import java.util.Scanner;

public class StringConversion_02 {
    public static void main(String[] args) {

        /*
        대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    private static String solution(String str) {

        String answer = "";

        for(char ch : str.toCharArray()) {
            if(Character.isLowerCase(ch)) {
                answer += Character.toUpperCase(ch);
            } else if(Character.isUpperCase(ch)) {
                answer += Character.toLowerCase(ch);
            }
        }
        return answer;
    }
}
