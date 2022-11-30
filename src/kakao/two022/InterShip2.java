package src.kakao.two022;

import java.util.LinkedList;
import java.util.Queue;

public class InterShip2 {
    public static void main(String[] args) {
        /**
         * 두 큐 합 같게 만들기
         */
        int[] queue1 = {1, 2, 1, 2};
        int[] queue2 = {1, 10, 1, 2};

        long sumOfOne = 0;
        long sumOfTwo = 0;

        Queue<Integer> qOne = new LinkedList<>();
        Queue<Integer> qTwo = new LinkedList<>();

        for (int i = 0; i < queue1.length; i++) {
            qOne.offer(queue1[i]);
            qTwo.offer(queue2[i]);

            sumOfOne = sumOfOne + queue1[i];
            sumOfTwo = sumOfTwo + queue2[i];
        }

        int answer = 0;
        while (sumOfOne != sumOfTwo) {

            if (sumOfOne > sumOfTwo) {

                int one = qOne.poll();
                qTwo.offer(one);

                sumOfOne = sumOfOne - one;
                sumOfTwo = sumOfTwo + one;

                answer++;

            } else {
                int two = qTwo.poll();
                qOne.offer(two);

                sumOfOne = sumOfOne + two;
                sumOfTwo = sumOfTwo - two;

                answer++;
            }

            if (qOne.isEmpty() || qTwo.isEmpty()) {
                answer = -1;
                break;
            }
        }

        System.out.println("answer = " + answer);
    }
}
