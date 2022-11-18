package src.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Tuple {
    public static void main(String[] args) {
        /**
         * 튜플 -> 문제 이해가 잘 안됨;
         * 그냥 갯수 중복이 가장 많이 되는 순서로 출력 하면 될듯
         */
        int[] answer = {};
        String s = "{{2,1},{2},{2,1,3},{2,1,3,4}}";

        String[] groups = s.substring(1, s.length() - 1).replace("},{", "}-{").split("-");
        Arrays.sort(groups, Comparator.comparingInt(String::length));

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < groups.length; i++) {
            String group = groups[i];
            String[] split = group.substring(1, group.length() - 1).split(",");
            for (int j = 0; j < split.length; j++) {
                int td = Integer.parseInt(split[j]);

                if (!result.contains(td)) {
                    result.add(td);
                }
            }
        }
        result.stream()
                .forEach(System.out::println);

    }
}
