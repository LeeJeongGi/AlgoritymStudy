package src.kakao.two022;

import java.text.ParseException;
import java.util.HashMap;
import java.util.TreeMap;

public class Problem2 {
    public static void main(String[] args) throws ParseException {
        /**
         * 주차 요금 계산
         */
        int[] fees = {180, 5000, 10, 600};
        String[] records = {
                "05:34 5961 IN",
                "06:00 0000 IN",
                "06:34 0000 OUT",
                "07:59 5961 OUT",
                "07:59 0148 IN",
                "18:59 0000 IN",
                "19:09 0148 OUT",
                "22:59 5961 IN",
                "23:00 5961 OUT"
        };

        HashMap<String, Integer> inTime = new HashMap<>();
        TreeMap<String, Integer> result = new TreeMap<>();

        for (String record : records) {
            String[] temp = record.split(" ");

            String time = temp[0];
            String number = temp[1];
            String status = temp[2];

            if ("IN".equals(status)) {
                inTime.put(number, converter(time));

                if (result.containsKey(number) == false) {
                    result.put(number, 0);
                }

            } else if ("OUT".equals(status)) {
                result.put(number, result.get(number) + converter(time) - inTime.get(number));
                inTime.remove(number);
            }
        }

        inTime.forEach((key, val) -> {
            result.put(key, result.get(key) + (23 * 60 + 59) - val);
        });

        int[] answer = new int[result.size()];
        int index = 0;
        for (Integer value : result.values()) {
            answer[index] = fees[1];

            if (value > fees[0]) {
                int temp = (int) (Math.ceil((value - fees[0]) / (double) fees[2]) * fees[3]);
                answer[index++] += temp;
            }
        }

    }

    public static int converter(String value) {

        String[] split = value.split(":");

        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
}
