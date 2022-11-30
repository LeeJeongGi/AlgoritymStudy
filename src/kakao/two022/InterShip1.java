package src.kakao.two022;

import java.util.HashMap;

public class InterShip1 {
    public static void main(String[] args) {
        /**
         * 성격 유형 검사
         */
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        HashMap<String, Integer> result = new HashMap<>();
        for (int i = 0; i < survey.length; i++) {
            String[] split = survey[i].split(",");

            String disagree = survey[i].substring(0, 1);
            String agree = survey[i].substring(1);
            int score = choices[i];

            switch (score) {
                case 1:
                    result.put(disagree, result.getOrDefault(disagree, 0) + 3);
                    break;
                case 2:
                    result.put(disagree, result.getOrDefault(disagree, 0) + 2);
                    break;
                case 3:
                    result.put(disagree, result.getOrDefault(disagree, 0) + 1);
                    break;
                case 4:
                    break;
                case 5:
                    result.put(agree, result.getOrDefault(agree, 0) + 1);
                    break;
                case 6:
                    result.put(agree, result.getOrDefault(agree, 0) + 2);
                    break;
                case 7:
                    result.put(agree, result.getOrDefault(agree, 0) + 3);
                    break;
            }
        }
        String answer = "";
        String[] sample = {"R-T", "C-F", "J-M", "A-N"};
        for (int i = 0; i < sample.length; i++) {

            String[] temp = sample[i].split("-");

            int first = result.get(temp[0]) == null ? 0 : result.get(temp[0]);
            int second = result.get(temp[1]) == null ? 0 : result.get(temp[1]);

            if (first > second) {
                answer += temp[0];
            } else if (first < second) {
                answer += temp[1];
            } else {
                answer += temp[0].compareTo(temp[1]) < 0 ? temp[0] : temp[1];
            }
        }
        System.out.println(answer);
    }
}
