package src.backjun.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Number1316 {
    public static void one316_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        for(int i = 0; i < N; i++) {
            String inputData = sc.next();

            if(isGroupWord(inputData)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isGroupWord(String inputData) {
        boolean flag = true;
        boolean[] isAlphabet = new boolean[26];
        Arrays.fill(isAlphabet, false);

        for(int i = 0; i < inputData.length(); i++) {
            int index = inputData.charAt(i) - 'a';

            if(!isAlphabet[index]) {
                isAlphabet[index] = true;

            } else {
                if(inputData.charAt(i) == inputData.charAt(i-1)) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return flag;
    }
}
