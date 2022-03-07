package src.lecture.string;

import java.util.Scanner;

public class Lecture_06 {
    public static void main(String[] args) {

        /*
        소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
        중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
         */
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    private static String solution(String input) {

        String answer = "";

        for(int i = 0; i < input.length(); i++) {
            if(input.indexOf(input.charAt(i)) == i) {
                answer += input.charAt(i);
            }
        }

        return answer;
    }
}
