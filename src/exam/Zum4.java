package src.exam;

public class Zum4 {

    public static int width = 0;
    public static int vertical = 0;

    public static int n;
    public static int count;
    public static void main(String[] args) {
        /**
         * 4번
         */
        int[][] grid = {
                {2, 1, 1, 3, 5, 1},
                {1, 1, 3, 3, 5, 5},
                {8, 3, 3, 3, 1, 5},
                {3, 3, 3, 4, 4, 4},
                {3, 3, 4, 4, 4, 4},
                {1, 4, 4, 4, 4, 4}
        };

        vertical = grid.length;
        width = grid[0].length;

        int min = Math.min(vertical, width);
        int max = Math.max(vertical, width);

        if (max > min + (min - 1)) {
            n = min;
        } else {
            n = min - 1;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                search(i, j, grid);
            }
        }

        System.out.println("n = " + n);
    }

    public static void search(int x, int y, int[][] grid) {



    }
}
