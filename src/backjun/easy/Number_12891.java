package src.backjun.easy;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Number_12891 {

    static int secretLength,usingLectureLength,answer;
    static String inputLecture;
    static HashMap<Character, Integer> required = new HashMap<>();

    public static void main(String[] args) {
        /**
         * DNA 비밀번호
         * 슬라이딩 윈도우를 통해 문제를 해결 한다.
         *
         * 슈도 코드
         * 1. 입력된 값을 잘 저장한다.
         * 2. 요구 되는 비밀번호를 저장하고, S 길이도 어떤 식으로 구성 되어 있는지 저장
         * 3. 요구 사항과 일치 한다면 갯수를 증가한다.
         */
        Scanner sc = new Scanner(System.in);
        secretLength = sc.nextInt();
        usingLectureLength = sc.nextInt();
        inputLecture = sc.next();

        required.put('A', -sc.nextInt());
        required.put('C', -sc.nextInt());
        required.put('G', -sc.nextInt());
        required.put('T', -sc.nextInt());

        addInRange(0, usingLectureLength);

        int left = 0;
        int right = usingLectureLength;
        while (true) {
            check();
            if (right >= secretLength) {
                break;
            }

            removeInRange(left, left + 1);
            addInRange(right, right + 1);
            left++;
            right++;
        }

        System.out.println(answer);
    }

    private static void check() {
        for (Integer value : required.values()) {
            if (value < 0) {
                return;
            }
        }
        answer++;
    }

    private static void removeInRange(int start, int end) {
        IntStream.range(start, end)
                .forEachOrdered(i -> required.compute(inputLecture.charAt(i), (character, integer) -> integer - 1));
    }

    private static void addInRange(int start, int end) {
        IntStream.range(start, end)
                .forEachOrdered(i -> required.compute(inputLecture.charAt(i), ((character, integer) -> integer + 1)));
    }
}
