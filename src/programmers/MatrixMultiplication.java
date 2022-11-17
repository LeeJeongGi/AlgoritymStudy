package src.programmers;

public class MatrixMultiplication {
    public static void main(String[] args) {
        /**
         * 행렬의 곱셈
         * 2차원 배열이 주어지면 행렬 곱셈을 해서 리턴 해주면 된다.
         */
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[i].length; j++){
                for(int k = 0; k < arr1[0].length; k++){
                    answer[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
    }
}
