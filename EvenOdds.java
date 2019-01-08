/**
 * Created by MalhotR1 on 05/18/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdds {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            long n = Long.parseLong(in[0]);
            long k = Long.parseLong(in[1]);

            if (k == 1) System.out.println(k);
            else {
                long even = n >> 1;
                long odd = n - even;

                long sol = 0;
                if (k <= odd) {
                    sol = 1 + (k - 1) * 2;
                } else {
                    k -= odd;
                    sol = 2 + (k - 1) * 2;
                }
                System.out.println(sol);
            }


        }
    }

}
