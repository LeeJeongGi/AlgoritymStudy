package src.programmers;

public class LeastCommonMultiples {
    public static void main(String[] args) {
        /**
         * N개의 최소공배수
         * 1. 최대 공약수, 최소 공배수 문제는 유클리드 호제법 알고리즘을 이용하여 푼다고 한다?
         * 2. 이름이 어렵긴 한데 코드 자체는 어렵지 않았음.
         */
        int[] arr = {2,6,8,14};

        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int maxYaksoo = gcd(answer, arr[i]);

            answer = answer * arr[i] / maxYaksoo;
        }

        System.out.println(answer);
    }

    public static int gcd(int first, int second) {
        int maxValue = Math.max(first, second);
        int minValue = Math.min(first, second);

        while (maxValue % minValue != 0) {
            int temp = maxValue % minValue;
            maxValue = minValue;
            minValue = temp;
        }

        return minValue;
    }
}
