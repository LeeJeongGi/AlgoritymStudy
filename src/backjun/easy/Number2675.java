package src.backjun.easy;

import java.util.Scanner;

public class Number2675 {
    public static void two675_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for(int i = 0; i < testCase; i++) {
            int number = sc.nextInt();
            String letter = sc.next();

            for(int j = 0; j < letter.length(); j++) {
                for(int k = 0; k < number; k++) {
                    System.out.print(letter.charAt(j));
                }
            }

            System.out.println();
        }
    }
}
