package src.programmers;

public class JadenCase {
    public static void main(String[] args) {
        /**
         * 모든 문자의 첫 시작을 대문자로 만들어서 출력
         */
        String s = "r the last week";

        String answer = "";

        // 모든 문자열 소문자로 변경
        String[] srr = s.toLowerCase().split("");

        boolean isFirst = true;

        for(int i = 0; i < srr.length; i++) {
            // 첫 글자일 경우 대문자로 변경
            answer += isFirst ? srr[i].toUpperCase() : srr[i];
            // 공백이 나오면 첫 글자 플그래 true로 변경
            isFirst = srr[i].equals(" ") ? true : false;
        }

        System.out.println("answer = " + answer);
    }
}
