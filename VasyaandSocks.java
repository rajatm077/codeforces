/**
 * Created by MalhotR1 on 12/01/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class VasyaandSocks {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int days = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);

            if (m > days) System.out.println(days);
            else {
                int total = days;
                while (days >= m) {
                    int q = days / m;
                    days = q + days % m;
                    total += q;
                }
                System.out.println(total);
            }
        }
    }

}
