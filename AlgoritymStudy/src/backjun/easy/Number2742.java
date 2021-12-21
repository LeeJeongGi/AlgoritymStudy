package backjun.easy;

import java.io.*;

public class Number2742 {
    public static void two742_main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        for(int i = N; i >= 1; i--) {
            sb.append(i + "\n");
        }
        System.out.println(sb);
    }
}
