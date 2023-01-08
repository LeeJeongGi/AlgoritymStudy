package src.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Buz04 {
    public static void main(String[] args) {
        /**
         *
         */
        List<Integer> arr1 = Arrays.asList(3, 1, 2, 6);
        List<Integer> arr2 = Arrays.asList(2, 8, 4, 9);

        int size = arr1.size();
        int answer = 0;

        Collections.sort(arr1, Collections.reverseOrder());
        Collections.sort(arr2);

        for(int i = 1; i <= size; i ++) {
            answer += (arr2.get(i - 1) - arr1.get(i - 1)) * i;
        }

        System.out.println("answer = " + answer);
    }
}
