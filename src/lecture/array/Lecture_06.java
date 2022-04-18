package src.lecture.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lecture_06 {
    public static void main(String[] args) {

        /**
         * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
         * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
         * 첫 자리부터의 연속된 0은 무시한다.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] value = new int[N];

        for(int i = 0; i < N; i++) {
            value[i] = sc.nextInt();
        }

        for (Integer integer : solution(value)) {
            System.out.print(integer + " ");
        }

    }

    private static List<Integer> solution(int[] value) {

        List<Integer> asnwers = new ArrayList<>();

        for(int i = 0; i < value.length; i++) {

            //reverse = reverse * 10 + 나머지
            int tmp = value[i];
            int res = 0;
            while(tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;

                tmp = tmp / 10;
            }

            if (isPrime(res)) {
                asnwers.add(res);
            }
        }

        return asnwers;
    }

    private static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
