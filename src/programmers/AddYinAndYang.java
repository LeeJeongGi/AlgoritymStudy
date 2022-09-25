package src.programmers;

import java.util.Scanner;

public class AddYinAndYang {
    public static void main(String[] args) {
        /**
         * 음양 더하기
         */
        Scanner sc = new Scanner(System.in);

        int[] absolutes = new int[]{4, 7, 12};
        boolean[] signs = new boolean[]{true,false,true};

        System.out.println(solution(absolutes, signs));
    }

    private static int solution(int[] absolutes, boolean[] signs) {

        int answer = 0;

        int length = absolutes.length;
        for (int i = 0; i < length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }
}
