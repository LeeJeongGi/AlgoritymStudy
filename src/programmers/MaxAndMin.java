package src.programmers;

public class MaxAndMin {
    public static void main(String[] args) {
        /**
         * 최댓값과 최솟값 구하기
         */
        String s = "1 2 3 4";

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        String[] values = s.split(" ");
        for (int i = 0; i < values.length; i++) {
            max = Math.max(max, Integer.parseInt(values[i]));
            min = Math.min(min, Integer.parseInt(values[i]));
        }

        String answer = "";
        answer = String.valueOf(min) + " " + String.valueOf(max);
        System.out.println("answer = " + answer);
    }
}
