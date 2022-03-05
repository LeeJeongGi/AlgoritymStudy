package src.lecture.string;

import java.util.Scanner;

public class Lecture_05 {
    public static void main(String[] args) {
        /*
        영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
        특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    private static String solution(String input) {

        String answer = "";

        char[] words = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;

        while(start < end) {
            if(!Character.isAlphabetic(words[start])) {
                start++;
            } else if(!Character.isAlphabetic(words[end])) {
                end--;
            } else {
                char temp = words[start];
                words[start] = words[end];
                words[end] = temp;

                start++;
                end--;
            }
        }
        answer = String.valueOf(words);
        return answer;
    }
}
