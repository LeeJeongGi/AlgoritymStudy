package src.programmers;

import java.util.*;

public class DiskController {
    public static void main(String[] args) {
        /**
         * 디스크 컨트롤러
         */
        int[][] job = {{0, 3}, {1, 9}, {2, 6}};
        System.out.println(solution(job));
    }

    public static int solution(int[][] jobs) {
        int answer = 0;
        int size = jobs.length;
        Queue<Disk> queue = new PriorityQueue<>();

        Arrays.sort(jobs, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        int processedCount = 0;
        int requestedCount = 0;
        int now = 0;
        while (processedCount < jobs.length) {
            for (int i = requestedCount; i < jobs.length; i++) {
                int requestedTime = jobs[i][0];
                int workingTime = jobs[i][1];

                if (requestedTime <= now) {
                    queue.add(new Disk(requestedTime, workingTime));
                    requestedCount++;
                    continue;
                }

                break;
            }

            if (queue.isEmpty()) {
                now++;
                continue;
            }


            Disk disk = queue.poll();

            now += disk.workingTime;
            answer += now - disk.requestedTime;

            processedCount++;
        }

        return answer / size;
    }

    private static class Disk implements Comparable<Disk> {
        int requestedTime;
        int workingTime;

        public Disk(int requestedTime, int workingTime) {
            this.requestedTime = requestedTime;
            this.workingTime = workingTime;
        }

        @Override
        public int compareTo(Disk o) {
            if (this.workingTime == o.workingTime) {
                return this.requestedTime - o.requestedTime;
            }
            return this.workingTime - o.workingTime;
        }
    }
}
