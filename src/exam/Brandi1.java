package src.exam;

import java.util.HashMap;

public class Brandi1 {
    public static void main(String[] args) {
        /**
         * 전기 요금
         */
        int[][] fees = {{100, 415, 90}, {250, 1600, 389}, {0, 7000, 480}};
        int usage = 530;

        int answer = 0;

        // 0. 입력 받은 배열 해쉬맵 저장?
        // 1. 구간 찾기
        // 2. 해당 구간에서 요금 계산 = 기본 요금 + 추가 요금
        int index = 0;
        for (int i = 0; i < fees.length; i++) {
            if (usage <= fees[i][0]) {
                index = i + 1;
                break;
            }

            if (index == 0) {
                index = fees.length;
            }
        }

        HashMap<Integer, ElectricityBill> hm = new HashMap<>();
        for (int i = 1; i <= fees.length; i++) {
            hm.put(i, new ElectricityBill(fees[i-1][0], fees[i - 1][1], fees[i - 1][2]));
        }

        int basicRate = hm.get(index).basicRate;
        int surcharge = 0;
        int levelRange = 0;

        int start = 1;
        while (start <= index) {
            ElectricityBill temp = hm.get(start);
            levelRange = temp.powerRange - levelRange;

            boolean isRanged = usage - levelRange > 0 ? true : false;
            if (isRanged && temp.powerRange != 0) {
                surcharge += temp.electricCharge * levelRange;
                usage -= levelRange;
            } else {
                surcharge += temp.electricCharge * usage;
            }

            start++;
        }

        answer = basicRate + surcharge;
        System.out.println("answer = " + answer);
    }

    private static class ElectricityBill {

        private int powerRange;
        private int basicRate;
        private int electricCharge;

        public ElectricityBill(int powerRange, int basicRate, int electricCharge) {
            this.powerRange = powerRange;
            this.basicRate = basicRate;
            this.electricCharge = electricCharge;
        }
    }
}
