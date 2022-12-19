package src.exam;

import java.util.Arrays;

public class DevMatching2021_1 {
    public static void main(String[] args) {
        /**
         * 로또의 최고 순위와 최저 순위
         */
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] answer = new int[2];

        int zeroCount = ZeroCount(lottos);
        int count = 0;
        for (int i = 0; i < lottos.length; i++) {

            int key = lottos[i];
            if (Arrays.stream(win_nums).anyMatch(j -> j == key)) {
                count++;
            }
        }
        answer[0] = rankTransfer(count + zeroCount);
        answer[1] = rankTransfer(count);
        System.out.println("count = " + count);
        System.out.println("zeroCount = " + zeroCount);
    }

    public static int ZeroCount(int[] lottos) {
        int result = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                result++;
            }
        }

        return result;
    }

    public static int rankTransfer(int value) {

        int result = 0;

        switch (value) {
            case 6:
                result = 1;
                break;
            case 5:
                result = 2;
                break;
            case 4:
                result = 3;
                break;
            case 3:
                result = 4;
                break;
            case 2:
                result = 5;
                break;
            default:
                result = 6;
                break;
        }

        return result;
    }
}
