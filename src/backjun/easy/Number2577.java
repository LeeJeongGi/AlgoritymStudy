package src.backjun.easy;

import java.util.Scanner;

public class Number2577 {
    public static void two577_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int multi = 1;

        for(int i= 0 ; i < 3; i++) {
            multi *= sc.nextInt();
        }

        String value = Integer.toString(multi);

        for(int i = 0; i < 10; i++) {
            int count = 0;
            for(int j = 0; j < value.length(); j++) {
                if(value.charAt(j) - '0' == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
