package src.lecture.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Lecture_04 {
    public static void main(String[] args) {

        /**
         * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
         * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
         */
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        System.out.println(solution(S, T));

    }

    private static int solution(String S, String T) {

        int answer = 0;

        HashMap<Character, Integer> TMap = new HashMap<>();
        for (char ch : T.toCharArray()) {
            TMap.put(ch, TMap.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> SMap = new HashMap<>();
        for (int i = 0; i < T.length() - 1; i++) {
            SMap.put(S.charAt(i), SMap.getOrDefault(S.charAt(i), 0) + 1);
        }

        int leftPointer = 0;
        for (int i = T.length() - 1; i < S.length(); i++) {
            SMap.put(S.charAt(i), SMap.getOrDefault(S.charAt(i), 0) + 1);

            if (TMap.equals(SMap)) {
                answer++;
            }

            SMap.put(S.charAt(leftPointer), SMap.get(S.charAt(leftPointer)) - 1);
            if (SMap.get(S.charAt(leftPointer)) == 0) {
                SMap.remove(S.charAt(leftPointer));
            }
            leftPointer++;
        }

        return answer;
    }
}
