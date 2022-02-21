package src.backjun.easy;

import java.util.Scanner;

public class Number10809 {
    public static void one0809_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] alphabet = new int[26];
        for(int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        String input = sc.nextLine();
        sc.close();

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(alphabet[ch - 'a'] == -1) {
                alphabet[ch - 'a'] = i;
            }
        }

        for(int value : alphabet) {
            System.out.print(value + " ");
        }
    }
}
