package src.backjun.easy;

import java.util.Scanner;

public class Number2941 {
    public static void two941_main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] croatiaMsg = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String inputData = sc.nextLine();

        for(int i = 0; i < croatiaMsg.length; i++) {
            if(inputData.contains(croatiaMsg[i])) {
                inputData = inputData.replace(croatiaMsg[i], "#");
            }
        }
        System.out.println(inputData.length());
    }
}
