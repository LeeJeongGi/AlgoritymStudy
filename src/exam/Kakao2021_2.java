package src.exam;

import java.util.*;

public class Kakao2021_2 {
    public static void main(String[] args) {
        /**
         * 메뉴 리뉴얼
         */
        String[] orders = {"XYZ", "XWY", "WXA"};
        int[] course = {2, 3, 4};
        String[] answer = {};
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < course.length; i++) {
            int menuCount = course[i];

            HashMap<String, Integer> menuTypeOfCount = new HashMap<>();
            for (String order : orders) {
                System.out.println("order = " + order);
                int n = order.length();
                boolean[] visited = new boolean[n];

                combination(order.toCharArray(), visited, 0, n, menuCount, menuTypeOfCount);
            }

            int maxValue = 2;
            for (String temp : menuTypeOfCount.keySet()) {
                maxValue = Math.max(maxValue, menuTypeOfCount.get(temp));
            }

            // Max Value의 key, value
            for (String temp : menuTypeOfCount.keySet()) {
                if (menuTypeOfCount.get(temp) == maxValue) {
                    result.add(temp);
                }
            }
        }
        Collections.sort(result);
        answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        System.out.println(result);
    }

    // 백트래킹 사용
    static void combination(char[] arr, boolean[] visited, int start, int n, int r, HashMap<String, Integer> menuTypeOfCount) {
        if (r == 0) {
            putMapInfo(arr, visited, n, menuTypeOfCount);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, menuTypeOfCount);
            visited[i] = false;
        }
    }

    // 배열 출력
    static void putMapInfo(char[] arr, boolean[] visited, int n, HashMap<String, Integer> menuTypeOfCount) {
        String temp = "";

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                temp +=arr[i];
            }
        }
        char[] tempChar = temp.toCharArray();
        Arrays.sort(tempChar);
        temp = new String(tempChar);
        menuTypeOfCount.put(temp, menuTypeOfCount.getOrDefault(temp, 0) + 1);
    }
}
