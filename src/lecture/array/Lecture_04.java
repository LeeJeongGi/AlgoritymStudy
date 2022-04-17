package src.lecture.array;

import java.util.Scanner;

public class Lecture_04 {
    public static void main(String[] args) {

        /**
         * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
         * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int value : solution(N)) {
            System.out.print(value + " ");
        }
    }

    private static int[] solution(int N) {

        int[] answer = new int[N];
        answer[0] = 1;
        answer[1] = 1;

        int firstValue = 1;
        int secondValue = 1;

        for(int i = 2; i < N; i++) {
//            int sum = firstValue + secondValue;
//            answer[i] = sum;
//
//            firstValue = secondValue;
//            secondValue = sum;

            //강의 풀이
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

}


