/**
 * Created by MalhotR1 on 2/10/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GeorgeAccomodation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        long count = 0;
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            int p = Integer.parseInt(in[0]);
            int q = Integer.parseInt(in[1]);
            count += (q - p > 1) ? 1 : 0;
        }
        System.out.println(count);
    }
}
