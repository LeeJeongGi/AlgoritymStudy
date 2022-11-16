package src.programmers;

public class LongJump {
    public static void main(String[] args) {
        /**
         * 멀리 뛰기.
         * 1.특정 수 n 까지 가는 경우의 수 구하기.
         * 2.매 시점마다 한칸가는 경우 두칸가는 경우 모두 카운트 해주면 될 것 같다.
         * 3.어차피 1234567로 나누기 때문에 int 형으로 선언해도 된다.
         */
        int n = 2000;
        int[] cache = new int[n + 1];

        cache[1] = 1;
        cache[2] = 2;
        for (int i = 3; i <= n; i++) {
            cache[i] = (cache[i - 1] + cache[i - 2]) % 1234567;
        }
        System.out.println("cache[n] = " + cache[n]);

    }
}
