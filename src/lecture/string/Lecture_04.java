package src.lecture.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecture_04 {
    public static void main(String[] args) {
        /*
        단어 뒤집기 - N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] str = new String[N];
        for(int i = 0; i < N; i++) {
            str[i] = sc.next();
        }

        for(String x : solution(N, str)) {
            System.out.println(x);
        }
    }

    private static ArrayList<String> solution(int N, String[] input) {

        ArrayList<String> answer = new ArrayList<>();

        for(String x : input) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }
}
