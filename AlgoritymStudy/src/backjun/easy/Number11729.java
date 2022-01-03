package backjun.easy;

import java.util.Scanner;

public class Number11729 {
    public static void one1729_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String input = sc.next();
        sc.close();

        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += input.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
