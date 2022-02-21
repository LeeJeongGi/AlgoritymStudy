package src.backjun.easy;

import java.util.Scanner;

public class Number8393 {
    public static void eight393_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        for(int i = 1; i <= n; i++) {
            result +=i;
        }

        System.out.println(result);
    }
}
