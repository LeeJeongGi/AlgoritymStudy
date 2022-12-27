package src.exam;

import java.util.*;
import java.util.stream.IntStream;

public class Zum2 {

    public static PriorityQueue<Document> pq;
    public static HashMap<Integer, Document> info;

    public static boolean[] visited;
    public static void main(String[] args) {
        /**
         * 2번
         */
        int[][] data = {
                {1,0,5}, {2,2,2}, {3,3,1}, {4,4,1}, {5,10,2}
//                {1,0,3}, {2,1,3}, {3,3,2}, {4,9,1}, {5,10,2}
//                {1, 2, 10}, {2, 5, 8}, {3, 6, 9}, {4, 20, 6}, {5, 25, 5}
        };

        int[] answer = new int[data.length + 1];

        visited = new boolean[data.length + 1];
        ArrayList<Integer> result = new ArrayList<>();

        info = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            info.put(data[i][0], new Document(data[i][0], data[i][1], data[i][2]));
        }

        pq = new PriorityQueue<>(new Comparator<Document>() {
            @Override
            public int compare(Document o1, Document o2) {
                return o1.pageCount - o2.pageCount;
            }
        });

        int time = 0;
        for (int i = 1; i < data.length + 1; i++) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            Document document = info.get(i);

            result.add(document.index);
            time += document.pageCount + document.time;
            addDocument(time);

            while (!pq.isEmpty()) {
                Document temp = pq.poll();
                time += temp.pageCount;
                result.add(temp.index);

                addDocument(time);
            }

        }

        IntStream.range(0, data.length).forEach(i -> {
            answer[i] = result.get(i);
        });

        IntStream.range(0, data.length).forEach(i -> {
            System.out.print(answer[i] + " ");
        });
    }

    private static void addDocument(int time) {
        for (Integer key : info.keySet()) {

            if (visited[key]) {
                continue;
            }

            Document tempDocument = info.get(key);
            if (tempDocument.time <= time) {
                pq.add(tempDocument);
                visited[tempDocument.index] = true;
            }
        }
    }

    public static class Document {

        int index;
        int time;
        int pageCount;

        public Document(int index, int time, int pageCount) {
            this.index = index;
            this.time = time;
            this.pageCount = pageCount;
        }
    }

}
