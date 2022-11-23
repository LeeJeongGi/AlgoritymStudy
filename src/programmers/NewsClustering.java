package src.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsClustering {
    public static void main(String[] args) {
        /**
         * 카카오 공채 문제 - 뉴스 클러스터링
         * 1. 두개의 문자열이 입력되면 2개씩 문자열을 잘라서 비교한 값을 보여준다.
         * 2. 우선 요구 사항에 맞게 진행해도 될 것 같다. 복잡도 신경 x
         */
        int answer = 0;

        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";

        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();

        cuttingStr(str1.toUpperCase(), first);
        cuttingStr(str2.toUpperCase(), second);

        List<String> union = new ArrayList<>();
        List<String> intersection = new ArrayList<>();

        for (String temp : first) {
            if (second.remove(temp)) {
                intersection.add(temp);
            }

            union.add(temp);
        }

        for (String temp : second) {
            union.add(temp);
        }

        double jacard = 0;
        if (union.size() == 0) {
            jacard = 1;
        } else {
            jacard = (double) intersection.size() / (double) union.size();
        }
        answer = (int) (jacard * 65536);

        System.out.println("answer = " + answer);
    }

    private static void cuttingStr(String value, List<String> wrap) {
        for (int i = 0; i < value.length() - 1; i++) {
            String temp = value.substring(i, i + 2);

            Pattern p = Pattern.compile( "^[a-zA-Z]*$");
            Matcher matcher = p.matcher(temp);
            if (matcher.find()) {
                wrap.add(temp);
            }
        }
    }
}
