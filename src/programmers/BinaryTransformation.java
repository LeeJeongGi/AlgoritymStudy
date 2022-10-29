package src.programmers;

import java.util.Scanner;

public class BinaryTransformation {

    static int count = 0;
    static int tryCount = 0;

    public static void main(String[] args) {
        /**
         * 이진 변환
         * 1.0을 제거한다.
         * 2.0을 제거한 문자 x의 길이를 이진수로 표현한다.
         * 3.위의 과정을 반복하면서 문자열 x가 1이 될때 횟수와 0을 제거한 갯수를 리턴한다.
         */
        Scanner sc = new Scanner(System.in);
        int[] answer = new int[2];

        String X = sc.nextLine();

        while (!X.equals("1")) {
            String temp = deleteOfZero(X);

            int tempLength = temp.length();
            X = Integer.toBinaryString(tempLength);
        }

        answer[0] = tryCount;
        answer[1] = count;
    }

    private static String deleteOfZero(String X) {
        String temp = "";

        for (int i = 0; i < X.length(); i++) {
            if ('0' == X.charAt(i)) {
                count++;
            } else {
                temp += X.charAt(i);
            }
        }

        tryCount++;
        return temp;
    }
}
