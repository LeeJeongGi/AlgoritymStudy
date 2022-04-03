package src.lecture.string;

import java.util.Scanner;

public class Lecture_10 {
    public static void main(String[] args) {

        /**
         * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
         */

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = sc.next().charAt(0);

        for (int x : solution(str,ch)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(String str, char ch) {

        int[] answer = new int[str.length()];
        int index = 1000;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                index = 0;
            } else {
                index++;
            }
            answer[i] = index;
        }

        index = 1000;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == ch) {
                index = 0;
            } else {
                index++;
                answer[i] = Math.min(answer[i], index);
            }
        }

        return answer;
    }
}
