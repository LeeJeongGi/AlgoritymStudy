import java.util.Arrays;

public class Bubble_Sort {

    private static void bubble_sort(int[] bubble, int length) {

        for(int i = 0; i < length - 1; i++) {
            for(int j = 0   ; j < length - i - 1; j++) {
                if(bubble[j] > bubble[j+1]) {
                    swap(bubble, j, j+1);
                }
            }
        }
    }

    private static void swap(int[] bubble, int i, int j) {
        int temp = bubble[i];
        bubble[i] = bubble[j];
        bubble[j] = temp;
    }

    public static void main(String[] args) {
        int[] bubble = {7,3,2,10,4,16};
        bubble_sort(bubble, bubble.length);

        Arrays.stream(bubble)
                .forEach(System.out::println);
    }
}