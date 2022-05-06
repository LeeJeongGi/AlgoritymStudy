package src.lecture.array;

import java.util.Scanner;

public class Lecture_10 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {

        /**
         * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
         * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
         * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
         * 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(N, board));
    }

    private static int solution(int N, int[][] board) {

        int result = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                boolean flag = true;

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if(nx >= 0 && nx < N && ny >= 0 && ny < N && board[nx][ny] >= board[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    result++;
                }
            }
        }

        return result;
    }
}
