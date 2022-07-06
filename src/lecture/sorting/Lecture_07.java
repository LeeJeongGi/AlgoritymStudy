package src.lecture.sorting;

import java.util.*;

public class Lecture_07 {
    public static void main(String[] args) {

        /**
         * N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
         * 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            points.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(points);
        for (Point point : points) {
            System.out.println(point);
        }

    }

    static class Point implements Comparable<Point>{

        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {

            if (this.x == o.x) {
                return this.y - o.y;
            } else {
                return this.x - o.x;
            }
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }
}
