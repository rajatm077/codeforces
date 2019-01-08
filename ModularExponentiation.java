/**
 * Created by MalhotR1 on 01/09/2018.
 * hello 2018, A
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModularExponentiation {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long n = Long.parseLong(br.readLine().trim());
            long m = Long.parseLong(br.readLine().trim());
            if (m < n) {
                System.out.println(m);
                return;
            }
            long lgm = calculatelgm(m);
            if (lgm < n) {
                System.out.println(m);
                return;
            }

            long res = m - ((m >> n) << n);
            System.out.println(res);
        }
    }

    private static long calculatelgm(long m) {
        if (m == 1) return 0;
        long count = 0;
        while (m > 1) {
            m = m >> 1;
            count++;
        }
        return count;
    }

}
