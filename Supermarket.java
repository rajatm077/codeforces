/**
 * Created by MalhotR1 on 11/30/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Supermarket {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            int a = 0, b = 0;
            double min = Double.MAX_VALUE;
            double rates = 0.0;
            for (int i = 0; i < n; i++) {
                in = br.readLine().trim().split(" ");
                a = Integer.parseInt(in[0]);
                b = Integer.parseInt(in[1]);
                rates = (a * 1.0) / b;
                min = (min < rates) ? min : rates;
            }
            double sol = min * m;
            System.out.println(sol);

        }
    }

}
