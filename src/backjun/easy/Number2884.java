package src.backjun.easy;

import java.util.Scanner;

public class Number2884 {
    public static void two2884_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if(minute < 45) {
            hour--;		// 시(hour) 1 감소
            minute= 60 - (45 - minute); 	// 분(min) 감소
            if(hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + minute);
        }
        else {
            System.out.println(hour + " " + (minute - 45));
        }
    }
}
