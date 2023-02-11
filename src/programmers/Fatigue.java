package src.programmers;

public class Fatigue {
    public static void main(String[] args) {
        /**
         * 피로도
         */
        System.out.println(solution(80, new int[][] {{80,20},{50,40},{30,10}}));
    }

    public static int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];

        return dfs(k, dungeons, visited, 0, 0);
    }

    private static int dfs(int k, int[][] dungeons, boolean[] visited, int depth, int answer) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                answer = dfs(k - dungeons[i][1], dungeons, visited, depth + 1, answer);
                visited[i] = false;
            }
        }

        return Math.max(answer, depth);
    }
}
