package src.backjun.easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Number2164 {
    public static void main(String[] args) {
        /**
         * 카드 : 맨 아래에 남아있는 최종 카드 1장은?
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(solution(N));
    }

    private static int solution(int N) {

        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        IntStream.rangeClosed(1, N).
                forEach(queue::offer);

        while (queue.size() != 1) {
            queue.poll();
            queue.offer(queue.poll());
        }
        answer = queue.poll();

        return answer;
    }
}
