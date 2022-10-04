package src.programmers;

import java.util.PriorityQueue;

public class MoreSpicy {
    public static void main(String[] args) {
        /**
         * 더 맵게 : 힙 정렬?
         */
        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
        int K = Integer.MAX_VALUE;

        System.out.println(solution(scoville, K));
    }

    private static int solution(int[] scoville, int K) {

        int answer = 0;

        // 슈도 코드
        // 1. 결국 핵심은 해당 배열내에 K보다 작은수가 없으면 된다.
        // 2. 우선 순위 큐를 활용해서 가장 작은 값부터 하나씩 꺼낸 후 K보다 작으면
        //    다음 작은것 꺼내서 계산하고 우선순위 큐에 넣어 준다.
        // 3. 반복 작업을 통해 가장 작은수가 k보다 커지는 순간 그 동안 카운터 했던 값을 리턴 해주면 될듯?
        PriorityQueue<Integer> heep = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            heep.offer(scoville[i]);
        }

        while (heep.peek() < K) {

            if (heep.size() == 1) {
                return -1;
            }

            int first = heep.poll();
            int seconds = heep.poll();

            int result = calculator(first, seconds);

            heep.offer(result);
            answer++;
        }

        return answer;
    }

    private static int calculator(int first, int seconds) {
        return first + (seconds * 2);
    }
}
