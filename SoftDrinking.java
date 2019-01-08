/**
 * Created by MalhotR1 on 11/30/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SoftDrinking {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int k = Integer.parseInt(in[1]);
            int l = Integer.parseInt(in[2]);
            int c = Integer.parseInt(in[3]);
            int d = Integer.parseInt(in[4]);
            int p = Integer.parseInt(in[5]);
            int nl = Integer.parseInt(in[6]);
            int np = Integer.parseInt(in[7]);

            nl = (k * l) / nl;
            c = c * d;
            p = p / np;

            int sol = Math.min(nl, Math.min(c, p)) / n;
            System.out.println(sol);
        }
    }

}
