/**
 * Created by MalhotR1 on 05/09/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaraCroft {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            long n = Long.parseLong(in[0]);
            long m = Long.parseLong(in[1]);
            long k = Long.parseLong(in[2]);
            long row = 1;
            long col = 1;

            if (k < n) {
                System.out.println(1 + k + " " + 1);
            } else {
                k = k - n + 1;
                row = n;

                if (k < m) {
                    System.out.println(row + " " + 1 + k);
                } else {
                    k = k - m + 1;
                    col = m;

                    row = row - (k + 1) / 2;
                    k -= (k + 1) / 2;
                    if ((k & 1) != 0) col--;
                    System.out.println(row + " " + col);
                }
            }
        }
    }

}
