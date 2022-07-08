package src.lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture_08 {
    public static void main(String[] args) {

        /**
         * 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
         * 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.
         */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }

        System.out.println(solution(N, M, values));

    }

    private static int solution(int N, int M, int[] values) {

        int answer = 0;

        Arrays.sort(values);
        for (int i = 0; i < N; i++) {
            if (values[i] == M) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}
