package src.backjun.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number10871 {
    public static void one0871_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        List<Integer> values = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            values.add(sc.nextInt());
        }

        for(int i = 0; i < values.size(); i++) {
            if(values.get(i) < X) {
                System.out.print(values.get(i) + " ");
            }
        }
    }
}
