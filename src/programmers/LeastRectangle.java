package src.programmers;

public class LeastRectangle {
    public static void main(String[] args) {
        /**
         * 최소 직사각형
         */
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int first = sizes[i][0];
            int second = sizes[i][1];

            if (first > second) {
                maxWidth = Math.max(maxWidth, first);
                maxHeight = Math.max(maxHeight, second);
            } else {
                maxWidth = Math.max(maxWidth, second);
                maxHeight = Math.max(maxHeight, first);
            }
        }

        return maxWidth * maxHeight;
    }
}
