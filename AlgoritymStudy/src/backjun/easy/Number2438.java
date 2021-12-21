package backjun.easy;

import java.util.Scanner;

public class Number2438 {
    public static void two2438_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            printStar(i, sb);
        }
        System.out.print(sb);
    }

    private static void printStar(int i, StringBuilder sb) {
        while(i > 0) {
            sb.append("*");
            i--;
        }
        sb.append("\n");
    }
}
