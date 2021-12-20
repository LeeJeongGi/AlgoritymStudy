package backjun;

import java.util.Scanner;

public class Number10950 {
    public static void one_0950_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tryCount = sc.nextInt();

        for(int i = 0; i < tryCount; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(String.format("%d", A+B));
        }
    }
}
