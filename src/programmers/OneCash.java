package src.programmers;

import java.util.LinkedList;

public class OneCash {

    static final int CACHE_HIT = 1;
    static final int CACHE_MISS = 5;

    public static void main(String[] args) {
        /**
         * 카카오 코딩 테스트 문제 - 1차 캐쉬
         * 1.LRU 알고리즘을 이용해 풀면 된다.
         */
        int answer = 0;
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        LinkedList<String> cache = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            String temp = cities[i].toUpperCase();

            // cache hit
            if (cache.remove(temp)) {
                cache.addFirst(temp);
                answer += CACHE_HIT;
            }
            // cache miss
            else {
                int currentSize = cache.size();

                answer += CACHE_MISS;
                if (cacheSize == currentSize) {
                    cache.removeLast();
                }
                cache.addFirst(temp);
            }
        }

        System.out.println("answer = " + answer);
    }
}
