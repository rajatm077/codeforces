/**
 * Created by MalhotR1 on 05/11/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int na = Integer.parseInt(in[0]);
            int nb = Integer.parseInt(in[0]);
            in = br.readLine().trim().split(" ");
            int k = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            in = br.readLine().split(" ");
            long[] a = new long[in.length];
            for (int i = 0; i < in.length; i++) {
                a[i] = Long.parseLong(in[i]);
            }

            in = br.readLine().split(" ");
            long[] b = new long[in.length];

            for (int i = 0; i < in.length; i++) {
                b[i] = Long.parseLong(in[i]);
            }

            long val = a[k-1];
            long comp = b[b.length - m];
            if (comp > val) System.out.println("YES");
            else System.out.println("NO");




        }
    }

}
