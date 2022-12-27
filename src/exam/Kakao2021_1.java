package src.exam;

public class Kakao2021_1 {
    public static void main(String[] args) {
        /**
         * 신규 아이디 추천
         */
        String new_id = "abcdefghijklmn.p";
        String answer = new_id;

        // 7단계 규칙대로만 하면 된다.
        // 대문자 -> 소문자
        answer = answer.toLowerCase();

        // 소문자 + 숫자 + -,_,. 제외하고 제거
        String match = "[^a-z0-9-_.]";
        answer = answer.replaceAll(match, "");
        answer = getFirstValueByEmptyValue(answer);
        // .., ... -> .으로 변경
        match = "[.]+";
        answer = answer.replaceAll(match, ".");
        answer = getFirstValueByEmptyValue(answer);

        // .은 끝에 있으면 안된다.
        if (answer.charAt(0) == '.') {
            answer = answer.substring(1);
            answer = getFirstValueByEmptyValue(answer);
        }

        if (answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
            answer = getFirstValueByEmptyValue(answer);
        }

        // 문자 길이 체크
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);

            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        if (answer.length() < 3) {
            int length = answer.length();

            while (length < 3) {
                answer += answer.charAt(answer.length() - 1);
                length++;
            }
        }

        System.out.println("answer = " + answer);
    }

    public static String getFirstValueByEmptyValue(String  value) {
        return "".equals(value) ? "a" : value;
    }
}
