package src.programmers;

public class TargetNumber {

    static int answer = 0;
    public static void main(String[] args) {
        /**
         * 타겟 넘버
         * numbers 의 값을 조합하여 target 을 만드는 경우의 수 구하기
         * 각 값을 더하거ㅓ나 빼는 과정을 반복해서 구하면 될듯
         */
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        DFS(numbers, target, 0, 0);
        System.out.println("answer = " + answer);
    }

    public static void DFS(int[] numbers, int target, int index, int sum) {
        if (index >= numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        DFS(numbers, target, index + 1, sum + numbers[index]);
        DFS(numbers, target, index + 1, sum - numbers[index]);
    }
}
