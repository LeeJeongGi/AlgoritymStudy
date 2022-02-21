package src.backjun.easy;

import java.io.*;

public class Number2741 {
    public static void two741_main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for(int i = 1; i <= N; i++) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}
