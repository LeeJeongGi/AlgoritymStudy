import java.util.Arrays;

public class Selection_Sort {

    private static void selectionSort(int[] sort, int size) {

        for(int i = 0; i < size - 1; i++) {
            int min_index = i;

            for(int j = i + 1; j < size; j++) {
                if(sort[j] < sort[min_index]) {
                    min_index = j;
                }
            }

            swap(sort, min_index, i);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void Selection_Sort_main(String[] args) {

        /*
        선택 정렬 : notion에 내용은 정리 했으니 참고 바람
         */
        int[] sort = {7,8,2,9,1};

        selectionSort(sort, sort.length);

        Arrays.stream(sort)
                .forEach(System.out::println);
    }
}
