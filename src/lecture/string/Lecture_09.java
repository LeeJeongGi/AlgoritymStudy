package src.lecture.string;

import java.util.Scanner;

public class Lecture_09 {
    public static void main(String[] args) {
        /*
        문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
        만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
         */
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(Integer.parseInt(solution(input)));
    }

    private static String solution(String input) {

        String answer = "";

        for(int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))) {
                answer += input.charAt(i);
            }
        }

        return answer;
    }
}
