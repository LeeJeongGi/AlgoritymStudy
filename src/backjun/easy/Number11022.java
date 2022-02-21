package src.backjun.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number11022 {
    public static void one1022_main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= T; i++) {
            String[] input = br.readLine().split(" ");

            int first = Integer.parseInt(input[0]);
            int second = Integer.parseInt(input[1]);
            int sum = first + second;

            sb.append(String.format("Case #%d: %d + %d = %d\n", i, first, second, sum));
        }

        System.out.print(sb);
    }
}
