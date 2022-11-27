package src.kakao.two022;

public class Problem1 {
    public static void main(String[] args) {
        /**
         * k 진수에서 소수 개수 구하기
         */
        int n = 437674;
        int k = 3;

        String change = Integer.toString(n, k);
        System.out.println("test = " + change);

        int answer = 0;
        String[] split = change.split("0+");
        for (String s : split) {
            if (isPrime(Long.parseLong(s))) {
                answer++;
            }
        }

        System.out.println("answer = " + answer);
    }

    public static boolean isContainZero(String value) {
        for (char ch : value.toCharArray()) {
            if (ch == '0') {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime(long value) {

        if (value == 2) {
            return true;
        }

        if (value == 1 || value % 2 == 0) {
            return false;
        }

        for (int i = 3; i < (int) Math.sqrt(value); i += 2) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }
}
