package src.lecture.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lecture_01 {

    public static final int MAX_SIZE = 10001;
    public static int[] distance = {-1, 1, 5};
    public static int[] checkBox;

    public static void main(String[] args) {

        /**
         * 현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
         *
         * 현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
         * 송아지는 움직이지 않고 제자리에 있다.
         * 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
         * 최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);

        int menLocation = sc.nextInt();
        int cowLocation = sc.nextInt();

        System.out.println(solution(menLocation, cowLocation));

    }

    private static int solution(int menLocation, int cowLocation) {

        int level = 0;

        checkBox = new int[MAX_SIZE];
        checkBox[menLocation] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(menLocation);

        while (!queue.isEmpty()) {

            int len = queue.size();
            for (int i = 0; i < len; i++) {

                int point = queue.poll();

                for (int j = 0; j < 3; j++) {
                    int nextPoint = point + distance[j];

                    if (nextPoint == cowLocation) {
                        return level + 1;
                    }

                    if (nextPoint >= 1 && nextPoint <= 10000 && checkBox[nextPoint] == 0) {
                        checkBox[nextPoint] = 1;
                        queue.offer(nextPoint);
                    }

                }
            }
            level++;
        }
        return level;
    }
}
