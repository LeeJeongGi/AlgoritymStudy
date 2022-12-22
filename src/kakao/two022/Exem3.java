package src.kakao.two022;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exem3 {
    public static void main(String[] args) {
//        List<Integer> box = new ArrayList<>();
//        box.add(5);
//        box.add(15);
//        box.add(19);
//
//        int answer = 0;
//        int average = getAverage(box);
//        int index = getMaxIndex(box);
//        int[] value = new int[box.size()];
//
//        for (int i = index; i >= 1; i--) {
//            int diff = box.get(i) - average;
//
//            value[i] = box.get(i) - diff;
//            value[i - 1] = box.get(i - 1) + diff;
//        }
//
//        if(value[box.size()] > average) {
//            int tt = value[box.size()] - average;
//
//            value[box.size()] -= tt;
//            value[box.size() - 1] += tt;
//        }
//
//        Arrays.sort(value);
//        answer = value[box.size() - 1];
//
//        answer = Collections.max(box);
//        System.out.println("answer = " + answer);

        test();
    }

    public static int getMaxIndex(List<Integer> temp) {
        int result = 0;

        int max = 0;
        for(int i = 0; i < temp.size(); i++) {
            if(max < temp.get(i)) {
                max = temp.get(i);
                result = i;
            }
        }

        return result;
    }

    public static int getAverage(List<Integer> temp) {
        int result = 0;

        int sum = 0;
        for(int i = 0; i < temp.size(); i++) {
            sum = sum + temp.get(i);
        }

        if (sum % temp.size() != 0) {
            result = sum / temp.size() + 1;
        } else {
            result = sum / temp.size();
        }

        return result;
    }

    public static void test() {

        String my_str = "abc1Addfggg4556b";
        int n = 6;

        String[] answer = new String[(my_str.length() / 6 + 1)];

        int index = 0;
        int len = 0;
        while(len < my_str.length()) {

            if(my_str.length() - len < 6) {
                answer[index] = my_str.substring(len);
            } else {
                answer[index] = my_str.substring(len, len + 6);
            }

            index++;
            len +=6;
        }
    }
}
