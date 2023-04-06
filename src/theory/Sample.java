package src.theory;

public class Sample {
    public static void main(String[] args) {
        /**
         * 1. 팩토리얼을 계산
         * 2. 계산된 숫자에서 뒷에서부터 연속된 0의 갯수를 체크
         */
        int answer = 0;
        int n = 5;
        int[] p = new int[10];


        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        while (factorial > 0) {
            if (factorial % 10 == 0) {
                answer++;
            }
            factorial /= 10;
        }

        System.out.println(factorial);
        System.out.println(answer);
        
    }
}
