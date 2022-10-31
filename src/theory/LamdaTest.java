package src.theory;

import java.util.ArrayList;
import java.util.List;

public class LamdaTest {
    public static void main(String[] args) {
        /**
         * 기본적인 람다 표현 연습
         */
        List<String> sList = new ArrayList<>();
        sList.add("Jack");
        sList.add("Tom");
        sList.add("Jack22");

        sList.stream()
                .sorted()
                .forEach(s -> System.out.println(s));

        System.out.println();

        sList.stream()
                .map(s -> s.length())
                .forEach(n -> System.out.println(n));

        System.out.println();

        sList.stream()
                .filter(s -> s.length() > 5)
                .forEach(s -> System.out.println(s));
    }
}
