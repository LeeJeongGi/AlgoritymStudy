package backjun.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Number10818 {
    public static void one0818_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] values = new int[N];

        for(int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(values);

        System.out.println(values[0] + " " + values[N-1]);
    }
}
