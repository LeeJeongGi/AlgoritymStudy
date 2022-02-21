package src.backjun.easy;

import java.util.Scanner;

public class Number1546 {
    public static void One546_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] score = new int[N];
        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;
        for(int i = 0; i < score.length; i++) {
            if(max < score[i]) {
                max = score[i];
            }
            sum += score[i];
        }

        double avg = 0;
        avg = 100.0 * sum / max / N;
        System.out.printf("%.2f", avg);
    }
}
