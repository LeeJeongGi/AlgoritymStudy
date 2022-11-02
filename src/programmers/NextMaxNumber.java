package src.programmers;

public class NextMaxNumber {
    public static void main(String[] args) {
        /**
         * 다음 큰 숫자
         */
        int n = 78;

        int answer = 0;
        int nCount = Integer.bitCount(n);

        while (true) {
            n++;
            if (Integer.bitCount(n) == nCount) {
                answer = n;
                break;
            }
        }
        System.out.println("answer = " + answer);
    }
}
