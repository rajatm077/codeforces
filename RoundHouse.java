/**
 * Created by MalhotR1 on 12/13/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RoundHouse {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int a = Integer.parseInt(in[1]);
            int b = Integer.parseInt(in[2]);

            b = ((b + n) % n + n) % n;

            int sol = (a + b);
            if (sol > n) sol = sol % n;
            System.out.println(sol);
        }
    }

}
