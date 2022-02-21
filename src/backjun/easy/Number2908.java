package src.backjun.easy;

import java.util.Scanner;

public class Number2908 {
    public static void two908_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.next();
        String second = sc.next();

        first = reverse(first);
        second = reverse(second);

        String result = Integer.parseInt(first) > Integer.parseInt(second) ? first : second;

        System.out.println(result);
    }

    private static String reverse(String value) {
        String temp = "";

        for(int i = value.length() - 1; i >= 0; i--) {
            char ch = value.charAt(i);
            temp += ch;
        }

        return temp;
    }
}
