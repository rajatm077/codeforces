/**
 * Created by MalhotR1 on 02/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomTeam273B {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            long n = Long.parseLong(in[0]);
            long k = Long.parseLong(in[1]);

            long kmax = calnc2(n-k+1);
            long kmin = 0;
            if (k == 1) kmin = kmax;
            else {
                long q = n / k;
                long r = n % k;
                long t1 = (k - r) * calnc2(q);
                long t2 = r * calnc2(q + 1);
                kmin = t1 + t2;
            }
            System.out.println(kmin + " " + kmax);
        }
    }

    private static long calnc2(long n) {
        long res = 0;
        if (n % 2 == 0) {
            res = (n / 2) * (n - 1);
        }else {
            res = ((n - 1) / 2) * n;
        }
        return res;
    }

}
