package src.programmers;

public class Jump {
    public static void main(String[] args) {
        /**
         * 점프와 순가이동
         * 1. 문제 접근 하는게 조금 까다로움...자연수 n이 범위가 10억 이하이기 때문에... logN으로 풀어야 할까..
         * 2. bottom - top, top - bottom 으로 접근해야되는 기분이 들었다.
         * 3. 예시를 보면 결국 짝수,홀수로 나누어서 생각하면 될 것 같다.
         */
        int n = 5;
        int answer = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                answer++;
                n--;
            }
        }
        System.out.println("answer = " + answer);
    }
}
