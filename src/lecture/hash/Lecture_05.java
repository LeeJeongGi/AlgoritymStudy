package src.lecture.hash;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Lecture_05 {
    public static void main(String[] args) {

        /**
         * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
         * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
         * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
         * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }

        System.out.print(solution(N, K, values));

    }

    private static int solution(int N, int K, int[] values) {

        int answer = -1;

        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int l = j + 1; l < N; l++) {
                    Tset.add(values[i] + values[j] + values[l]);
                }
            }
        }

        int count = 0;
        for (Integer integer : Tset) {
            count++;

            if (count == K) {
                return integer;
            }
        }

        return answer;
    }
}
