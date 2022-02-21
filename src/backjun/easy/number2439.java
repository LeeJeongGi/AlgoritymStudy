package src.backjun.easy;

import java.util.Scanner;

public class number2439 {
    public static void two439_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N-i; j++) {
                sb.append(" ");
            }

            for (int k = 0; k < i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
