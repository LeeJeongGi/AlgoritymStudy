package src.lecture.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lecture_01 {
    public static void main(String[] args) {
        /**
         * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
         * (첫 번째 수는 무조건 출력한다)
         */
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.next());
        int[] numbers = new int[num];

        for(int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int number : solution(num,  numbers)) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> solution(int number, int[] numbers) {

        List<Integer> answer = new ArrayList<>();
        answer.add(numbers[0]);

        for(int i = 1; i < number; i++) {
            if(numbers[i] > numbers[i-1]) {
                answer.add(numbers[i]);
            }
        }

        return answer;
    }
}
