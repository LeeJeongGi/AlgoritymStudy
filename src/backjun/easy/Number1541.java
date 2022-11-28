package src.backjun.easy;

import java.util.Scanner;

public class Number1541 {
    public static void main(String[] args) {
        /**
         * 잃어버린 괄호
         */
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));
    }

    public static int solution(String input) {
        int answer = 0;

        // 55-50+40
        String[] tmp = input.split("-");
        for (int i = 0; i < tmp.length; i++) {
            int sum = getSum(tmp[i]);

            if (i == 0) {
                answer += sum;
            } else {
                answer = answer - sum;
            }
        }

        return answer;
    }

    private static int getSum(String tmp) {
        int sum = 0;
        String[] temp = tmp.split("[+]");

        for (int j = 0; j < temp.length; j++) {
            sum += Integer.parseInt(temp[j]);
        }
        return sum;
    }
}
