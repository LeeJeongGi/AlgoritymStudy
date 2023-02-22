package src.programmers;

public class ExpressedAsN {
    public static void main(String[] args) {
        /**
         * N으로 표현
         *
         * 1. N으로 number로 만드는 방법중 가장 작은 것을 리턴
         * 2. 최솟값을 구하는 것이기 때문에 그냥 bfs로 하면 될듯
         * 3. 해당 숫자가 number가 아니라면 ?
         *      - 더한다, 뺀다, 나눈다, 곱하기, 해당 숫자를 붙인다.
         */
        System.out.println(solution(5, 12));
    }

    public static int solution(int N, int number) {
        int min = Integer.MAX_VALUE;
        return dfs(0, N, number, 0, min);
    }

    public static int dfs(int depth, int N, int number, int current, int min) {
        if (depth > 8) {
            return -1;
        }

        if (number == current) {
            return min = Math.min(depth, min);
        }

        int temp = 0;

        for (int i = 0; i < 8; i++) {
            if (depth + i < 8) {
                temp = temp * 10 + N;
                dfs(depth + i + 1, N, number, current + temp, min);
                dfs(depth + i + 1, N, number, current - temp, min);
                dfs(depth + i + 1, N, number, current / temp, min);
                dfs(depth + i + 1, N, number, current * temp, min);
            }
        }

        return min;
    }
}
