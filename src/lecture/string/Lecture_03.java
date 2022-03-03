package src.lecture.string;

import java.util.Scanner;

public class Lecture_03 {
    public static void main(String[] args) {
        /*
        한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(solution(input.split(" ")));
    }

    private static String solution(String[] values) {
        String answer = "";

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < values.length; i++) {
            if(max < values[i].length()) {
                max = values[i].length();
                answer = values[i];
            }
        }

        return answer;
    }
}
