    package src.backjun.easy;

    import java.util.*;
    import java.util.stream.IntStream;

    public class Number1325 {

        static ArrayList<Integer>[] computers;
        static int[] trust;
        static boolean[] visited;
        public static void main(String[] args) {
            /**
             * 효율적인 해킹
             */
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int M = sc.nextInt();

            computers = new ArrayList[N + 1];
            trust = new int[N + 1];
            IntStream.rangeClosed(1, N)
                    .forEach(i -> computers[i] = new ArrayList<>());

            for (int i = 0; i < M; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();

                computers[start].add(end);
            }

            for (int i = 1; i <= N; i++) {
                visited = new boolean[N + 1];
                bfs(i);
            }

            int maxValue = Arrays.stream(trust).max().orElse(-1);
            IntStream.rangeClosed(1, N).filter(i -> trust[i] == maxValue).forEach(System.out::println);
        }

        static void bfs(int v) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(v);
            visited[v] = true;

            while (!queue.isEmpty()) {
                int temp = queue.poll();

                for (int i : computers[temp]) {
                    if (!visited[i]) {
                        queue.add(i);
                        trust[i]++;
                        visited[i] = true;
                    }
                }
            }
        }
    }
