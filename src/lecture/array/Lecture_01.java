package src.lecture.array;

import java.util.Scanner;

public class Lecture_01 {
    public static void main(String[] args) {
        /**
         * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
         * (첫 번째 수는 무조건 출력한다)
         */
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.next());
        String[] letters = new String[number];

        for(int i = 0; i < number; i++) {
            letters[i] = sc.next();
        }

        String answer = letters[0];
        for (int i = 1; i < number; i++) {

            int point = Integer.parseInt(letters[i]);
            int before = Integer.parseInt(letters[i - 1]);

            if(point > before) {
                answer += " " + letters[i];
            }
        }
        System.out.println(answer);
    }
}
