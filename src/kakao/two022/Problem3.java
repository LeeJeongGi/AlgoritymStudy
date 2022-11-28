package src.kakao.two022;

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        /**
         * 양궁 대회
         */
        int n = 5;
        int[] info = {2,1,1,1,0,0,0,0,0,0,0};

        int[] answer = new int[info.length];
        int[] temp = new int[info.length];
        int maxDiff = 0;

        for(int subset = 1; subset < (1 << 10); subset++) {
            System.out.println("subset = " + subset);
            int apeach = 0, ryan = 0, cnt = 0;
            for (int i = 0; i < 10; i++) {

                if ((subset & (1 << i)) != 0) {
                    ryan += 10 - i;
                    temp[i] = info[i] + 1;
                    cnt += temp[i];
                } else {
                    temp[i] = 0;
                    if (info[i] > 0) {
                        apeach += 10 - i;
                    }
                }
            }

            if (cnt > n) {
                continue;
            }

            temp[10] = n - cnt;
            if (ryan - apeach == maxDiff) {

                for(int i = 10; i >=0; i--) {
                    if (temp[i] > answer[i]) {
                        maxDiff = ryan - apeach;
                        answer = Arrays.copyOf(temp, temp.length);
                        break;
                    } else if (temp[i] < answer[i]) {
                        break;
                    }
                }

            } else if (ryan - apeach > maxDiff) {
                maxDiff = ryan - apeach;
                answer = Arrays.copyOf(temp, temp.length);
            }
        }
        if (maxDiff == 0) {
            answer = new int[]{-1};
        }
        System.out.println("answer = " + answer);
    }
}
