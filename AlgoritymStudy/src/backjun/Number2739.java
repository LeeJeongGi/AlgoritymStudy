package backjun;

import java.util.Scanner;

public class Number2739 {
    public static void two739_main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplication = sc.nextInt();

        for(int i = 1; i < 10; i++) {
            System.out.println(String.format("%d * %d = %d ", multiplication, i, multiplication * i));
        }
    }
}
