package src.lecture.string;

import java.util.Scanner;

public class Lecture_08 {

    public static void main(String[] args) {

        /*
        앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
        문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
        단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
         */
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] words = input.split(" ");

        System.out.println(solution(input));
    }

    private static String solution(String words) {

        String answer = "NO";
        words = words.toUpperCase().replaceAll("[^A-Z]", "");

        String reverseWords = new StringBuilder(words).reverse().toString();
        if(words.equals(reverseWords)) {
            answer = "YES";
        }

        return answer;
    }
}
