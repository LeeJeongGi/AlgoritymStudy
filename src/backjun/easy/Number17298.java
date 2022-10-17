package src.backjun.easy;

import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

public class Number17298 {
    public static void main(String[] args) {
        /**
         * 오큰수 구하기
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] seq = new int[N];

        IntStream.range(0, N)
                .forEach(i -> seq[i] = sc.nextInt());

        Stack<Integer> stack = new Stack<>();
        IntStream.range(0, N).forEach(i -> {
            while (!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
                seq[stack.pop()] = seq[i];
            }
            stack.push(i);
        });

        while (!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }

        IntStream.range(0, N)
                .forEach(i -> {
                    System.out.print(seq[i] + " ");
                });
    }
}
