package src.exam;

public class Zum3 {
    public static void main(String[] args) {
        /**
         * 3번
         */
        int[] histogram = {6,5,7,3,4,2};
        int answer = 0;

        for (int i = 0; i < histogram.length; i++) {

            int j = i + 1;
            while (j < histogram.length) {
                int tt = j - i - 1;
                int ttt = Math.min(histogram[i], histogram[j]);
                answer = Math.max(answer, tt * ttt);
                j++;

            }
        }

        System.out.println("answer = " + answer);
    }
}
