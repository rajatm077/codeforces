/**
 * Created by MalhotR1 on 01/01/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DreamoonStairs {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int steps = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            int no2 = steps / 2;

            int min_steps = (steps - 2*no2) + no2;
            int max_steps = no2 + min_steps;
            for (int i = min_steps; i <= max_steps ; i++) {
                if (i % m == 0) {
                    System.out.println(i);
                    return;
                }
            }
            System.out.println(-1);
        }
    }

}
