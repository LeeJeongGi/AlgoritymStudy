package src.backjun.easy;

import java.util.*;

public class Number3052 {
    public static void Three052_main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputData = new int[10];
        for(int i = 0; i < inputData.length; i++) {
            inputData[i] = sc.nextInt();
        }

        Set<Integer> resultValues = new TreeSet<>();
        for(int i = 0; i < inputData.length; i++) {
            resultValues.add(inputData[i] % 42);
        }

        System.out.println(resultValues.size());
    }
}
