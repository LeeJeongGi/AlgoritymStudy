package src.lecture.greed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lecture_01 {
    public static void main(String[] args) {
        /**
         * 씨름선수
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Person> persons = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            int inputKey = sc.nextInt();
            int inputWeigh = sc.nextInt();

            persons.add(new Person(inputKey, inputWeigh));
        }

        Collections.sort(persons);
        int maxWeigh = Integer.MIN_VALUE;
        int answer = 0;

        for (int i = 0; i < N; i++) {
            if (maxWeigh < persons.get(i).weigh) {
                maxWeigh = persons.get(i).weigh;
                answer++;
            }
        }
        System.out.println(answer);
    }

    static class Person implements Comparable<Person> {
        int key;
        int weigh;

        public Person(int key, int weigh) {
            this.key = key;
            this.weigh = weigh;
        }

        @Override
        public int compareTo(Person o) {
            return o.key - this.key;
        }
    }
}
