package src.theory;

public class InsertionSort {
    public static void main(String[] args) {
        /**
         * 삽입정렬
         * 배열의 각 원소를 이미 정렬된 부분 배열과 비교하여 적절한 위치에 삽입하면서 정렬하는 방식입니다.
         * 정렬되지 않은 부분 배열의 첫 번째 원소를 선택하여 이미 정렬된 부분 배열과 비교하며, 자신보다 작은 원소를 만날 때까지 계속해서 왼쪽으로 이동합니다.
         *
         * 이때, 정렬된 부분 배열의 모든 원소들은 오른쪽으로 한 칸씩 이동합니다.
         * 정렬된 부분 배열에서 자신보다 작은 원소를 만나게 되면 해당 위치에서 멈추고, 선택한 원소를 그 위치에 삽입합니다.
         * 이러한 과정을 모든 원소에 대해 반복하면서 정렬을 완료합니다.
         *
         * 삽입정렬은 평균적으로 O(n^2)의 시간 복잡도를 가지지만, 입력이 이미 정렬되어 있거나 거의 정렬된 경우에는 효율적으로 동작합니다.
         * 또한, 안정적인 정렬 알고리즘이며, 정렬 중에 다른 메모리를 사용하지 않기 때문에 제한된 메모리 환경에서 사용할 수 있는 장점이 있습니다.
         */
        int[] arr = {4, 3, 5, 2, 1};

        System.out.println("정렬 전의 배열 모습");
        printArr(arr);

        insertionSort(arr);

        printArr(arr);
        System.out.println("정렬 후의 배열 모습");
    }

    private static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
