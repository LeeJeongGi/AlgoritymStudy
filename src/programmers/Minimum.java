package src.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Minimum {
    public static void main(String[] args) {
        /**
         * 길이가 같은 두 개의 배열에서 최솟값 구하기
         */
        int[] A = new int[]{1, 4, 2};
        int[] B = new int[]{5, 4, 4};

        System.out.println(solution(A, B));
    }

    private static int solution(int[] A, int[] B) {

        int answer = 0;

        /**
         * 슈도 코드.
         * 1. 하나의 배열은 내림차순, 다른 하나는 오름차순 정렬을 한다.(원시 타입이 아니라 리벌스 기능사용은 못함)
         *    그냥 다른 하나도 내림차순하고 곱할때 뒤에있는 원소부터 곱하자.
         * 2. 각각 곱하고 더해서 결과를 리턴한다.
         */
        Arrays.sort(A);
        Arrays.sort(B);

        answer = IntStream.range(0, A.length)
                .map(i -> (A[i] * B[A.length - i - 1]))
                .sum();

        return answer;
    }
}
