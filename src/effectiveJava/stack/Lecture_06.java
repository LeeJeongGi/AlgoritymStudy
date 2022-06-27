package src.effectiveJava.stack;

import java.util.*;

public class Lecture_06 {
    public static void main(String[] args) {

        /**
         * 공주를 구하러 갈 왕자는 ?
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(solution(N, K));

    }

    private static int solution(int N, int K) {

        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.offer(i + 1);
        }

        while (queue.size() != 1) {

            for (int i = 1; i <= K; i++) {
                int temp = queue.poll();

                if (i != K) {
                    queue.offer(temp);
                }

            }
        }
        answer = queue.poll();

        return answer;
    }
}
