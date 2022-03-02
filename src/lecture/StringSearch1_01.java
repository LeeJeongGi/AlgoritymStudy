package src.lecture;

import java.util.Scanner;

public class StringSearch1_01 {
    public static void main(String[] args) {
        /*
        설명
        한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
        대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
         */
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = sc.next().charAt(0);

        System.out.println(solution(str, ch));
    }

    public static int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for ( char x : str.toCharArray()) {
            if(x == t) {
                answer += 1;
            }
        }

        return answer;
    }
}
