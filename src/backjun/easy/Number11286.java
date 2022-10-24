package src.backjun.easy;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Number11286 {
    public static void main(String[] args) throws IOException {
        /**
         * 절댓값 힙
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);

            if (first == second) {
                return o1 > o2 ? 1 : -1;
            } else {
                return first - second;
            }
        }));

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            if (x != 0) {
                pq.offer(x);
            } else {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            }
        }
    }
}
