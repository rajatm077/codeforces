/**
 * Created by MalhotR1 on 2/8/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MishkaGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int cnt_1 = 0;
        int cnt_2 = 0;
        for (int t = 0; t < N; t++) {
            String[] in = br.readLine().trim().split(" ");
            int M = Integer.parseInt(in[0]);
            int C = Integer.parseInt(in[1]);
            if (M > C) cnt_1++;
            else if (M < C) cnt_2++;
        }

        if (cnt_1 < cnt_2) System.out.println("Chris");
        else if (cnt_1 > cnt_2) System.out.println("Mishka");
        else System.out.println("Friendship is magic!^^");

    }
}
