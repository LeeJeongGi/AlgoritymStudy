package src.backjun.easy;

import java.util.Scanner;

public class Number10952 {
    public static void one0952_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A == 0 && B == 0) {
                sc.close();
                break;
            }

            System.out.println(A + B);
        }
    }
}
