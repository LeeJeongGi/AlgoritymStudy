package src.lecture.greed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lecture_02 {
    public static void main(String[] args) {
        /**
         * 회의실 배정
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Meeting> meetings = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {

            int tempStart = sc.nextInt();
            int tempEnd = sc.nextInt();

            meetings.add(new Meeting(tempStart, tempEnd));
        }
        Collections.sort(meetings);
        int answer = 1;
        int firstEndMeeting = meetings.get(0).end;
        for (int i = 1; i < N; i++) {
            Meeting tempMeet = meetings.get(i);
            int tempStart = tempMeet.start;

            if (firstEndMeeting <= tempStart) {
                answer++;
                firstEndMeeting = meetings.get(i).end;
            }
        }
        System.out.println(answer);
    }

    static class Meeting implements Comparable<Meeting>{
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            if(this.end == o.end) {
                return this.start - o.start;
            }

            return this.end - o.end;
        }
    }
}
