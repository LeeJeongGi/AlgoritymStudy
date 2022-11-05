package src.programmers;

import java.util.ArrayList;

public class EndingInEnglish {
    public static void main(String[] args) {
        /**
         * 영어 끝말잇기
         * 1.끝말잇기를 진행하면서 탈락자를 뽑아내는 퀴즈~
         * 2.특별한 알고리즘으로 접근하기 보다는 문제 해결에 초점을 맞추어 진행하기.
         * 3.문제 흐름에 맞게 진행해보자. - 디테일한 조건은 구현 후 다듬기
         */
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        ArrayList<String> cash = new ArrayList<>();

        int person = 0;
        int round = 0;
        for (int i = 0; i < words.length; i++) {

            if (cash.contains(words[i])) {
                person = (i % n) + 1;
                round = (i / n) + 1;

                break;
            }

            cash.add(words[i]);

            if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                person = (i % n) + 1;
                round = (i / n) + 1;

                break;
            }

        }

        System.out.println("person = " + person);
        System.out.println("round = " + round);
    }
}
