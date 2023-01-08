package src.exam;

import java.util.stream.IntStream;

public class Mad01 {
    public static void main(String[] args) {
        int[] number = {100, 101, 102, 103, 104};
        int[] start = {1, 2};
        int[] finish = {2, 4};

        int[] cache = new int[number.length];
        cache[0] = number[0];
        for (int i = 1; i < number.length; i++) {
            cache[i] = cache[i - 1] + number[i];
        }

        int size = start.length;
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            int tempStart = start[i];
            int tempFinish = finish[i];

            System.out.println(cache[tempFinish] - cache[tempStart - 1]);
            answer[i] = getSumNumber(number, tempStart, tempFinish);
        }

        IntStream.range(0, size).forEach(i -> System.out.println("answer[i] = " + answer[i]));
    }

    public static int getSumNumber(int[] number, int start, int finish) {
        int sum = 0;

        for (int i = start; i <= finish; i++) {
            sum += number[i];
        }

        return sum;
    }
}
