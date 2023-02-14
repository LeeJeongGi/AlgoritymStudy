package src.programmers;

import java.util.ArrayList;

public class VowelDictionary {

    final static String[] gather = {"A", "E", "I", "O", "U"};

    public static void main(String[] args) {
        /**
         * 모음사전
         */
        System.out.println(solution("AAAE"));
    }

    public static int solution(String word) {
        int answer = 0;

        ArrayList<String> result = recursion("", 0, new ArrayList<>());
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).equals(word)) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    private static ArrayList<String> recursion(String temp, int depth, ArrayList<String> list) {
        list.add(temp);

        if (depth == 5) {
            return list;
        }

        for (int i = 0; i < gather.length; i++) {
            recursion(temp + gather[i], depth + 1, list);
        }

        return list;
    }
}
