package src.lecture.array;

import java.util.Scanner;

public class Lecture_03 {
    public static void main(String[] args) {
        /**
         * A,B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고,
         * B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
         * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        for(char answer : solution(N, A, B).toCharArray()) {
            System.out.println(answer);
        }
    }

    private static String solution(int N, int[] A, int[] B) {
        String answer = "";

        /**
         * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
         */
        for (int i = 0; i < N; i++) {

            if(A[i] == B[i]) {
                answer += "D";
            } else if(A[i] == 1 && B[i] == 3) {
                answer += "A";
            } else if(A[i] == 2 && B[i] == 1) {
                answer += "A";
            } else if(A[i] == 3 && B[i] == 2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }

        return answer;
    }
}
