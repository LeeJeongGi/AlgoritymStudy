package src.theory;

public class BubbleSort {
    public static void main(String[] args) {
        /**
         * 버블 정렬
         * 버블 정렬(Bubble sort)은 두 인접한 원소를 비교하여 큰 값을 오른쪽으로, 작은 값을 왼쪽으로 이동시키며 정렬하는 알고리즘입니다.
         * 버블 정렬은 코드가 간단하고 이해하기 쉬우며, 작은 데이터에 대해서는 효율적입니다. 하지만 데이터의
         * 크기가 커질수록 비효율적이며, 시간 복잡도는 O(n^2)입니다. 따라서 대부분의 경우에는 다른 정렬 알고
         * 리즘보다 성능이 떨어집니다.
         */
        int[] arr = {4, 3, 5, 2, 1};

        System.out.println("정렬 전의 배열 모습");
        printArr(arr);

        bubbleSort(arr);

        printArr(arr);
        System.out.println("정렬 후의 배열 모습");
    }

    private static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
