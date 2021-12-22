package backjun.easy;

import java.util.Scanner;

public class Number1110 {
    public static void one110_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int temp = value;
        int count = 1;

        while(true) {

            int first = temp / 10;
            int second = temp % 10;

            int sum = first + second;
            int sumSecond = sum % 10;

            String newValue = String.valueOf(second) + String.valueOf(sumSecond);
            int parseValue = Integer.parseInt(newValue);

            if(parseValue == value) {
                break;
            }
            temp = parseValue;
            count++;
        }

        System.out.println(count);
    }
}
