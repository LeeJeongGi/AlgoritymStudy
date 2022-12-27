package src.exam;

public class Zum1 {
    public static void main(String[] args) {
        /**
         * 1번 문제.
         */
        long n = 3;
        long answer = 0;

        int naturalNumber = 1;
        while (true) {
            long quotient = naturalNumber / n;
            long remainder = naturalNumber % n;

            if (quotient >= n) {
                break;
            }

            if (quotient == remainder) {
                answer += naturalNumber;
            }
            naturalNumber++;
        }
        System.out.println("answer = " + answer);
    }
}
