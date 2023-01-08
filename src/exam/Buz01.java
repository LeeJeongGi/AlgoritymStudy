package src.exam;

import java.util.ArrayList;
import java.util.List;

public class Buz01 {
    public static void main(String[] args) {

        List<Integer> initialEnergy = new ArrayList<>();
        initialEnergy.add(15);
        initialEnergy.add(7);
        initialEnergy.add(8);
        initialEnergy.add(19);
        initialEnergy.add(8);
        long th = 1;

        int answer = 0;
        int index = 0;
        while (true) {
            long sum = getSumEnergy(initialEnergy, index);

            if (sum == 0 ) {
                answer = index - 1;
                break;
            }

            if (sum < th) {
                answer = index - 1;
                break;
            }

            index++;
        }

        System.out.println("answer = " + answer);

    }

    public static long getSumEnergy(List<Integer> initialEnergy, int index) {
        long result = 0;

        for(int i = 0; i < initialEnergy.size(); i++) {
            int temp = initialEnergy.get(i) - index;
            if (temp > 0) {
                result += temp;
            }
        }

        return result;
    }
}
