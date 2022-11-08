package src.programmers;

public class ExpectedDraw {
    public static void main(String[] args) {
        /**
         * 예상 대진표
         * 1.규칙을 찾아보면 결국 짝수일 경우 n/2로 감수하고 홀수일 경우 n/2 + 1로 감소한다.
         * 2.즉 a,b가 만날는 경우를 찾으면 되기때문에 만날때까지 돌리면 될듯?
         */
        int n = 8;
        int a = 4;
        int b = 7;

        int answer = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }

        System.out.println("answer = " + answer);
    }
}
