package src.lecture.sorting;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lecture_05 {
    public static void main(String[] args) {

        /**
         * 현수네 반에는 N명의 학생들이 있습니다.
         * 선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
         * 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
         * N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<Integer> values = new HashSet<>();
        for (int i = 0; i < N; i++) {
            values.add(sc.nextInt());
        }

        System.out.println(values.size() == N ? "U" : "D");

    }
}
