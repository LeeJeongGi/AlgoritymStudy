package src.lecture.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Lecture_01 {
    public static void main(String[] args) {

        /**
         * 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
         * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
         * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String vote = sc.next();

        System.out.println(solution(N, vote));

    }

    private static char solution(int N, String vote) {

        char answer = ' ';
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char x : vote.toCharArray()) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (Character key : hm.keySet()) {
            if (hm.get(key) > max) {
                max = hm.get(key);
                answer = key;
            }
        }

        return answer;
    }
}
