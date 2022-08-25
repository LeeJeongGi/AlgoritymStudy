package src.lecture.greed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Lecture_04 {

    static int N, MAX = Integer.MIN_VALUE;

    public static void main(String[] args) {
        /**
         * 최대 수입 스케줄
         */
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();

            arr.add(new Lecture(m, d));
            if (d > MAX) {
                MAX = d;
            }
        }
        System.out.println(solution(arr));
    }

    public static int solution(ArrayList<Lecture> arrayList) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        Collections.sort(arrayList);
        int j = 0;
        for (int i = MAX; i >= 1; i--) {
            for (; j < N; j++) {
                if (arrayList.get(j).time < i) {
                    break;
                }
                pQ.offer(arrayList.get(j).money);
            }

            if (!pQ.isEmpty()) {
                answer += pQ.poll();
            }
        }

        return answer;
    }

    static class Lecture implements Comparable<Lecture> {
        public int money;
        public int time;

        public Lecture(int money, int time) {
            this.money = money;
            this.time = time;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.time - this.time;
        }
    }
}
