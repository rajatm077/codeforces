/**
 * Created by MalhotR1 on 2/9/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Team {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int cnt = 0;

        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            int cnt2 = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
                cnt2 += arr[i];
            }
            if (cnt2 > 1) cnt++;
        }
        System.out.println(cnt);
    }
}
