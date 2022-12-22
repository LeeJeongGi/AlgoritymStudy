package src.kakao.two022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exem2 {
    public static void main(String[] args) {

        List<Integer> cost = new ArrayList<>(Arrays.asList(
                24575, 6426, 9445, 18772, 81, 13447, 10629, 23497, 27202, 27775, 24325));

        int x = 1054424895;

        int answer = 0;
        double maxNumber = Math.pow(10,9) + 7;

        double sum = 0;
        int index = cost.size() - 1;
        while (x >= 0) {
            if (x > cost.get(index)) {
                x -= cost.get(index);
                sum = sum + Math.pow(2, index) % maxNumber;
            }
            index--;
            if (index < 0) {
                break;
            }
        }

        answer = (int) sum;
        System.out.println("answer = " + answer);
    }
}
