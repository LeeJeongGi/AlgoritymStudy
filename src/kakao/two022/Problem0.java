package src.kakao.two022;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem0 {
    public static void main(String[] args) {
        /**
         * 신고 결과 받기.
         */
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        HashMap<String, ArrayList> reportLists = new HashMap<>();
        HashMap<String, Integer> reportCount = new HashMap<>();
        HashMap<String, Integer> result = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            reportLists.put(id_list[i], new ArrayList());
            reportCount.put(id_list[i], 0);
            result.put(id_list[i], 0);
        }

        for (int i = 0; i < report.length; i++) {
            String[] split = report[i].split(" ");
            String userId = split[0];
            String reportUserId = split[1];

            ArrayList<String> userOfReported = reportLists.get(userId);
            if (!userOfReported.contains(reportUserId)) {
                userOfReported.add(reportUserId);
                reportCount.put(reportUserId, reportCount.get(reportUserId) + 1);
            }

        }

        ArrayList<String> stopUser = new ArrayList<>();
        for (String user : reportCount.keySet()) {
            if (reportCount.get(user) >= k) {
                stopUser.add(user);
            }
        }

        for (int i = 0; i < stopUser.size(); i++) {
            String user = stopUser.get(i);
            for (String key : reportLists.keySet()) {
                if (reportLists.get(key).contains(user)) {
                    result.put(key, result.get(key) + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = result.get(id_list[i]);
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
