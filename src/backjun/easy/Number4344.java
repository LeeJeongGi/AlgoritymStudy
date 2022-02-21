package src.backjun.easy;

import java.util.Scanner;

public class Number4344 {
    public static void four344_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        int[] scores;
        for(int i = 0; i < C; i++) {

            int person = sc.nextInt();
            scores = new int[person];

            double sum = 0;
            for(int j = 0; j < person; j ++) {
                int value = sc.nextInt();
                scores[j] = value;
                sum += value;
            }

            double avg = sum / person;
            double avgOverPerson = 0;

            for(int j = 0; j < person; j++) {
                if(scores[j] > avg) {
                    avgOverPerson++;
                }
            }
            System.out.printf("%.3f%%\n", (avgOverPerson/person)*100);
        }
    }
}
