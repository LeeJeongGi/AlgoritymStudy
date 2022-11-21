package src.programmers;

import java.util.Arrays;

public class BestSet {
    public static void main(String[] args) {
        /**
         * 최고의 집합
         * 1. 어려워서 힌트를 보니 덧셈에 집중하지 말고 곱셈에 집중을 하라는 말을 들엇다.
         * 2. 어떤 경우에 곱셈이 최댓값이 될까 ?
         * 3. 이렇게 접근하니 힌트가 조금 도움이 되었다. 11일 경우 3 x 4 x 4 가 최댓값
         *    즉 s / n 에 근접 할 수록 곱이 최대가 된다.
         */
        int n = 2;
        int s = 9;

        int[] answer = new int[n];

        if (n > s) {
            answer[0] = -1;
        } else {
            int rem = s % n;
            int po = n - rem;    //1씩 더해줘야하는 인덱스 위치

            for(int i = 0; i < po; i++) {  //po까지는 원래대로 추가
                answer[i] = s / n;
            }
            for(int i = po; i < n; i++) {  //po부터 n까지는 1씩 추가
                answer[i] = s / n +1;
            }
        }

        Arrays.stream(answer)
                .forEach(i -> {
                    System.out.println(i);
                });

    }
}
