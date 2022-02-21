package src.backjun.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number8958 {
    public static void eight958_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TestCase = sc.nextInt();
        List<String> scores = new ArrayList<>();
        for(int i = 1; i <= TestCase; i++) {
            scores.add(sc.next());
        }
        sc.close();
        for(int i = 0; i < scores.size(); i++) {
            int plus = 0;
            int sum = 0;

            String OX = scores.get(i);
            for(int j = 0; j < OX.length(); j++) {

                if(OX.charAt(j) == 'O') {
                    plus++;
                } else {
                    plus = 0;
                }
                sum += plus;
            }
            System.out.println(sum);
        }
    }
}
