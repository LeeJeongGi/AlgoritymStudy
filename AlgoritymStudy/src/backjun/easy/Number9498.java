package backjun.easy;

import java.util.Scanner;

public class Number9498 {
    public static void nine_498main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";


        int score = sc.nextInt();

        if(score >= 90) {
            result = "A";
        } else if(score >= 80) {
            result = "B";
        } else if(score >= 70) {
            result = "C";
        } else if(score >= 60) {
            result = "D";
        } else {
            result = "F";
        }

        sc.close();
        System.out.println(result);
    }
}
