package src.exam;

import java.util.HashMap;

public class DevMatching2021_3 {
    public static void main(String[] args) {

        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};

        int[] answer = new int[enroll.length];

        HashMap<String, Integer> reserves = new HashMap<>();
        HashMap<String, String> recommender = new HashMap<>();

        for (int i = 0; i < enroll.length; i++) {
            reserves.put(enroll[i], 0);

            if(!referral[i].equals("-")) {
                recommender.put(enroll[i], referral[i]);
            }
        }

        for (int i = 0; i < seller.length; i++) {
            String tempSeller = seller[i];
            int sellCostOfBrush = amount[i] * 100;

            while (recommender.containsKey(tempSeller)) {
                int discountCost = getDiscountMoney(sellCostOfBrush);

                if (discountCost == 0) {
                    break;
                }

                reserves.put(tempSeller, reserves.get(tempSeller) + sellCostOfBrush - discountCost);

                tempSeller = recommender.getOrDefault(tempSeller, "center");
                sellCostOfBrush = discountCost;
            }

            reserves.put(tempSeller, reserves.get(tempSeller) + sellCostOfBrush - getDiscountMoney(sellCostOfBrush));
        }

        int index = 0;
        for (String s : enroll) {
            answer[index++] = reserves.get(s);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    public static int getDiscountMoney(int value) {
        return value / 10;
    }

}
