package src.programmers;

import java.util.Arrays;
import java.util.HashSet;

public class PokemonChoice {
    public static void main(String[] args) {
        /**
         * 가장 많은 포켓몬 선택
         */
        int[] nums = new int[]{3,3,3,2,2,4};

        // 슈도 코드
        // 입력 받은 N개 중에서 N/2개를 선택 할 수 있다? 최댓값 = N /2
        // 중복은 허용하지 않기 때문에 배열에서 중복을 제거 하면 된다.
        // 중복을 허용하지 않는 자료구조를 사용해서 크기를 구하면 끝날듯.
        HashSet<Integer> hm = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hm.add(nums[i]);
        }

        int answer = hm.size();
        while (answer > nums.length / 2) {
            answer -= 1;
        }

        System.out.println("answer = " + answer);
    }
}
