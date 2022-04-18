package src.lecture.array;

import java.util.Scanner;

public class Lecture_05 {
    public static void main(String[] args) {

        /**
         * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
         * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
         */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] eratos = new int[N + 1];

        System.out.println(solution(N, eratos));
    }

    private static int solution(int N, int[] eraots) {

        int result = 0;

        for(int i = 2; i <= N; i++) {

            if(eraots[i] == 0) {
                result++;
                for(int j = i; j <= N; j= j+i) {
                    eraots[j] = 1;
                }
            }

        }
        return result;
    }
}
