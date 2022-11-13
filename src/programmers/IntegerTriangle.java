package src.programmers;

public class IntegerTriangle {
    public static void main(String[] args) {
        /**
         * 정수 삼각형
         * 1.삼각형에 대해 정보가 주어진다면? 아래로 대각선으로 내려가면서 최종 합이 가장 큰 경우를 구하는 문제
         * 2.문제를 읽고 가장 먼저 떠오른 것은 DP 알고리즘 ? 매 순간 최선의 선택을 한다면 그게 최고 높은 값이 아닐까?
         */
        int[][] triangle = {
                {7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4},{4, 5, 2, 6, 5}
        };

        int answer = 0;

        int[][] cache = new int[triangle.length][triangle.length];
        cache[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    cache[i][j] = cache[i - 1][j] + triangle[i][j];
                } else if (j == i) {
                    cache[i][j] = cache[i - 1][j - 1] + triangle[i][j];
                } else {
                    cache[i][j] = Math.max(cache[i - 1][j], cache[i - 1][j - 1]) + triangle[i][j];
                }

                answer = Math.max(answer, cache[i][j]);
            }
        }
        System.out.println("answer = " + answer);

    }
}
