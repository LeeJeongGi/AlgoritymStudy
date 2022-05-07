package src.lecture.array;

import java.util.Scanner;

public class Lecture_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] gradeCard = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                gradeCard[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(N,M,gradeCard));
    }

    private static int solution(int N, int M, int[][] gradeCard) {

        int answer = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {

                int count = 0;

                for (int k = 0; k < M; k++) {
                    int posI = 0, posJ = 0;
                    for (int s = 0; s < N; s++) {
                        if(gradeCard[k][s] == i) {
                            posI = s;
                        }
                        if (gradeCard[k][s] == j) {
                            posJ = s;
                        }
                    }
                    if (posI < posJ) {
                        count++;
                    }
                }

                if (count == M) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
