package src.programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class DoublePriorityQueue {
    public static void main(String[] args) {
        /**
         * 이중우선순위큐.
         * 1. 문제 요구 사항대로 진행 하면 될 것 같다.
         * 2. 키 포인트는 객체 지향적으로 코드를 작성 하면 좋을듯?
         */
        int[] answer = new int[2];
        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        PriorityQueue<Integer> pqASC = new PriorityQueue<>();
        PriorityQueue<Integer> pqDESC = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < operations.length; i++) {
            String[] temp = operations[i].split(" ");

            if (temp[0].equals("I")) {
                pqASC.offer(Integer.parseInt(temp[1]));
                pqDESC.offer(Integer.parseInt(temp[1]));
            } else if(temp[0].equals("D")) {
                if (!pqDESC.isEmpty()) {
                    if (temp[1].equals("1")) {
                        pqASC.remove(pqDESC.poll());
                    } else if (temp[1].equals("-1")) {
                        pqDESC.remove(pqASC.poll());
                    }
                }
            }
        }

        if (!pqDESC.isEmpty()) {
            answer[0] = pqDESC.peek();
            answer[1] = pqASC.peek();
        }

        System.out.println("answer[0] = " + answer[0]);
        System.out.println("answer[1] = " + answer[1]);
    }
}
