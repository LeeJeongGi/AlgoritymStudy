package src.lecture.graph;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Lecture_02 {
    public static void main(String[] args) {
        /**
         * 10진수 -> 2진수 (재귀함수 이용)
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        DFS(N);
    }

    public static void DFS(int N) {

        if (N == 0) {
            return;
        } else {
            DFS(N / 2);
            System.out.print(N % 2 + " ");

        }

    }
}
