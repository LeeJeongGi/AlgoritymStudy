package src.kakao.two022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.IntStream;

public class Problem0 {
    public static void main(String[] args) {
        /**
         * 신고 결과 받기.
         */
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        HashMap<String, HashSet<String>> reportLists = new HashMap<>();
        HashMap<String, HashSet<String>> reportResult = new HashMap<>();

        for (int i = 0; i < report.length; i++) {
            String[] split = report[i].split(" ");

            String userId = split[0];
            String reportUserId = split[1];

            if (!reportLists.containsKey(userId)) {
                reportLists.put(userId, new HashSet<>());
            }
            reportLists.get(userId).add(reportUserId);

            if (!reportResult.containsKey(reportUserId)) {
                reportResult.put(reportUserId, new HashSet<>());
            }
            reportResult.get(reportUserId).add(userId);
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            int count = 0;
            String temp = id_list[i];

            if (!reportLists.containsKey(temp)) {
                continue;
            }

            HashSet<String> ttt = reportLists.get(temp);
            for (String s : ttt) {
                if (reportResult.get(s).size() >= k) {
                    answer[i]++;
                }
            }

        }

        IntStream.range(0, answer.length)
                .forEach(i -> System.out.print(answer[i] + " "));
    }
}
