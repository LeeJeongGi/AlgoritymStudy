package src.backjun.easy;

import java.util.Scanner;

public class Number1157 {
    public static void one157_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputData = sc.nextLine();
        inputData = inputData.toLowerCase();
        sc.close();

        int[] alphabet = new int[26];
        matchingAlphabetCount(inputData, alphabet);

        char maxCountChar = findMaxChar(alphabet);
        System.out.println(maxCountChar);
    }

    private static void matchingAlphabetCount(String inputData, int[] alphabet) {
        for(int i = 0; i < inputData.length(); i++) {
            char ch = inputData.charAt(i);

            alphabet[ch - 'a']++;
        }
    }

    private static char findMaxChar(int[] alphabet) {
        int max = -1;
        char resultChar = '?';

        for(int i = 0; i < 26; i++) {
            if(alphabet[i] > max) {
                max = alphabet[i];
                resultChar = (char) (i + 65);
            }
            else if (alphabet[i] == max) {
                resultChar = '?';
            }
        }

        return resultChar;
    }
}
