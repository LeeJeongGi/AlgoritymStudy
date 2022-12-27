package src.exam;

public class OneOfOne1 {
    public static void main(String[] args) {
        int N = 1001;

        /**
         * 1.n의 자릿수 합을 구한다.
         * 2.n보다 큰수 중 n의 자릿수 합과 동일한 가장 작은 수를 출력?
         */
        int answer = 0;
        int standard = getSum(N);
        int temp = N;

        while (true) {
            temp++;
            int tempSum = getSum(temp);

            if (standard == tempSum) {
                answer = temp;
                break;
            }
        }

        System.out.println("answer = " + answer);

    }

    private static int getSum(int value) {

        String integer = String.valueOf(value);
        int result = 0;

        for (int i = 0; i < integer.length(); i++) {
            result += Integer.parseInt(integer.substring(i, i + 1));
        }
        return result;
    }
}
