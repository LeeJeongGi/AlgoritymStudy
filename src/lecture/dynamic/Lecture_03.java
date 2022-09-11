package src.lecture.dynamic;

import java.util.Scanner;

public class Lecture_03 {

    static int[] dy;

    public static void main(String[] args) {
        /**
         * 최대 부분 증가 수열
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int answer = 0;

        dy = new int[arr.length];
        dy[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }
}
