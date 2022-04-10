package src.lecture.string;

import java.util.Scanner;

public class Lecture_13 {
    public static void main(String[] args) {

        /**
         * 현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
         * 비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.
         * 비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
         * 만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.
         *
         * 1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
         * 2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
         * 3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
         * 참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.
         *
         * 현수가 4개의 문자를 다음과 같이 신호로 보냈다면
         * #****###**#####**#####**##**
         * 이 신호를 4개의 문자신호로 구분하면
         *
         *  #****## --> 'C'
         * #**#### --> 'O'
         * #**#### --> 'O'
         * #**##** --> 'L'
         * 최종적으로 “COOL"로 해석됩니다.
         */
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        String input = sc.next();

        System.out.println(solution(index, input));

    }

    private static String solution(int index, String input) {

        /**
         * 1.문자를 입력받는다.
         * 2.7자리로 자른다
         * 3.2진수로 변환한다 (# -> 1, * -> 0)
         * 4.2진수 -> 10진수 변환
         * 5.10진수로 변환한 값의 알파벳을 반환
         * 6.출력
         */

        String answer = "";

        for (int i = 0; i < index; i++) {
            String temp = input.substring(0, 7);

            temp = temp.replace("#", "1").replace("*", "0");
            input = input.substring(7);

            //Integer 메서드 활용해서 정수화 시키기 -> temp 문자 2진수로 보낸다 -> 정수로 돌려달라라는 뜻
            int num = Integer.parseInt(temp, 2);
            answer += (char) num;
        }

        return answer;
    }
}
