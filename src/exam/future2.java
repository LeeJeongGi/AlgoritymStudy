package src.exam;

public class future2 {

    private static long[][] map;
    private static long total;
    private static long cnt = 1;
    public static void main(String[] args) {
        /**
         * 지그재그
         */
        int n = 10000;
        int r = 10;
        int c = 10;

        map = new long[n + 1][n + 1];
        total = n * n;
        settingMap(n, r, c);

        System.out.println("array = " + map[r][c]);

    }

    private static void settingMap(int n, int r, int c) {
        int x = 0, y = 1;
        boolean isUp = true;
        while (cnt <= total) {
            if (y == n && cnt <= total) { //2차원 배열의 오른쪽 끝에 도달하는 경우
                map[++x][y] = cnt++;
                isUp = false;
            }

            if (x == n && cnt <= total) { //2차원 배열의 아래쪽 끝에 도달하는 경우
                map[x][++y] = cnt++;
                isUp = true;
            }

            if (x == 1 && cnt <= total) { //2차원 배열의 위쪽 끝에 도달하는 경우
                map[x][++y] = cnt++;
                isUp = false;
            }

            if (y == 1 && cnt <= total) { //2차원 배열의 왼쪽 끝에 도달하는 경우
                map[++x][y] = cnt++;
                isUp = true;
            }

            if (isUp && y != n && x != 1 && cnt <= total) {
                map[--x][++y] = cnt++;  //그 외 dir이 UP인 경우
            }

            if (!isUp && x != n && y != 1 && cnt <= total) {
                map[++x][--y] = cnt++;
            }

            if (r == x && c == y) {
                System.out.println("확인++++++++");
                break;
            }
        }
    }
}
