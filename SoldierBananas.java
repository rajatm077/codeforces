/**
 * Created by MalhotR1 on 2/10/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SoldierBananas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int k = Integer.parseInt(in[0]);
        int dollars = Integer.parseInt(in[1]);
        long n = Long.parseLong(in[2]);
        long temp = 0;
        long req = 0;
        if (n % 2 == 0) {
            req = k * (n / 2) * (n + 1);
        }
        else req = k * (n * (n + 1) / 2);

        if (req > dollars) System.out.println(req - dollars);
        else System.out.println(0);
    }
}
