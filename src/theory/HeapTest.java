//package theory;
//
//import src.theory.Heap;å
//
//import java.util.Random;
//
//public class HeapTest {
//    public static void heap_main(String[] args) {
//        Heap<Integer> heap = new Heap<>();
//
//        Random rnd = new Random();
//
//        for(int i = 0; i < 15; i++) {
//            heap.add(rnd.nextInt(100));
//        }
//
//        // 힙 내부 배열의 요소 상태
//        System.out.print("내부 배열 상태 : ");
//        for(Object val : heap.toArray()) {
//            System.out.print(val + " ");
//        }
//        System.out.println();
//
//
//        // 힙이 비어있을 때 까지 한 개씩 요소 뽑음
//        System.out.print("힙 요소 뽑기 : \t");
//        while(!heap.isEmpty()) {
//            System.out.print(heap.remove() + " ");
//        }
//    }
//}
