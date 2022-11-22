package src.programmers;

public class CutArray {
    public static void main(String[] args) {
        /**
         * 배열 자르기
         * 문제에서 제시한 방식대로 풀면 될듯?
         */
        int n = 3;
        int left = 2;
        int right = 5;

        int[] answer = new int[right - left + 1];

        for(int i = 0; i < answer.length; i++){
            int row = (int)((i + left) / n) + 1; // 행
            int col = (int)((i + left) % n) + 1; // 열

            System.out.println("row = " + row);
            System.out.println("col = " + col);
        }
    }
}
