import java.util.Arrays;

public class Insertion_Sort {

    public static void Insertion_main(String[] args) {

        int[] a = {6,10,2,9,4,3};


        Insertion_Sort(a, a.length);
        Arrays.stream(a)
                .forEach(System.out::println);
    }

    private static void Insertion_Sort(int[] a, int size) {

        for(int i = 1; i < size; i++) {
            for(int j = i; j > 0; j--) {
                if(a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
