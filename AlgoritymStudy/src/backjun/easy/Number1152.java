package backjun.easy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Number1152 {
    public static void one152_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputData = sc.nextLine();
        inputData.split(" ");
        sc.close();

        StringTokenizer st = new StringTokenizer(inputData, " ");
        System.out.println(st.countTokens());
    }
}
