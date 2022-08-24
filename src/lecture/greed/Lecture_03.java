package src.lecture.greed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lecture_03 {
    public static void main(String[] args) {
        /**
         * 결혼식
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Time> times = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            int tempStart = sc.nextInt();
            int tempEnd = sc.nextInt();

            times.add(new Time(tempStart, 's'));
            times.add(new Time(tempEnd, 'e'));
        }

        Collections.sort(times);
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        for (Time time : times) {
            if (time.state == 's') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(cnt, answer);
        }
        System.out.println(answer);
    }

    static class Time implements Comparable<Time> {
        public int time;
        public char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time o) {
            if(this.time == o.time) {
                return this.state - o.state;
            }
            return this.time - o.time;
        }
    }
}
