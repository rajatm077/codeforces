/**
 * Created by MalhotR1 on 2/8/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int N = Integer.parseInt(in[0]);
        long X = Long.parseLong(in[1]);
        long cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i*j == X) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
