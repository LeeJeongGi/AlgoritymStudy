package backjun.easy;

import java.util.Scanner;

public class Number2562 {
    public static void two562_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] values = new int[9];
        for(int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        int max = 0;
        int count = 0;
        int index = 0;

        for(int value : values) {
            count++;
            if(value > max) {
                max = value;
                index = count;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
