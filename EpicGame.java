/**
 * Created by MalhotR1 on 12/10/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EpicGame {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int a = Integer.parseInt(in[0]);
            int b = Integer.parseInt(in[1]);
            int n = Integer.parseInt(in[2]);
//            int a = Integer.parseInt(in[0]);
            if (a == b && a == 1) {
                if (n % 2 == 0) System.out.println(1);
                else System.out.println(0);
            } else {
                boolean Simon = true;
                int k = 0;
                while (n > 0) {
                    if (Simon) n = n - GCD(a, n);
                    else n = n - GCD(b, n);
                    if (n > 0) Simon = !Simon;
                }
                if (Simon) System.out.println(0);
                else System.out.println(1);
            }
        }

    }

    public static int GCD(int a, int b) { return b == 0 ? a : GCD(b, a%b); }

}

