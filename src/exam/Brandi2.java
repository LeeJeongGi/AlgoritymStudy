package src.exam;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Brandi2 {
    public static void main(String[] args) {
        int[] ball = {11, 2, 9, 13, 24};
        int[] order = {9, 2, 13, 24, 11};

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < ball.length; i++) {
            deque.add(ball[i]);
        }

        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> waiting = new ArrayList<>();
        for (int i = 0; i < order.length; i++) {
            int temp = order[i];

            while (isContains(waiting, deque.getFirst()) || isContains(waiting, deque.getLast())) {

                int first = deque.getFirst();
                int last = deque.getLast();

                if (isContains(waiting, deque.getFirst())) {
                    answer.add(deque.pollFirst());
                    waiting.remove(getIndexOfValue(waiting, first));
                } else if (isContains(waiting, deque.getLast())) {
                    answer.add(deque.pollLast());
                    waiting.remove(getIndexOfValue(waiting, last));
                }
            }

            if (deque.getFirst() == temp) {
                answer.add(deque.pollFirst());
            } else if (deque.getLast() == temp) {
                answer.add(deque.pollLast());
            } else {
                waiting.add(temp);
            }
        }

        System.out.println("test");
    }

    private static boolean isContains(ArrayList<Integer> temp, int value) {
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) == value) {
                return true;
            }
        }

        return false;
    }

    private static int getIndexOfValue(ArrayList<Integer> temp, int value) {
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) == value) {
                return i;
            }
        }

        return -1;
    }
}
