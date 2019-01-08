/**
 * Created by MalhotR1 on 12/13/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PlayingWithPaper {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            long a  = Long.parseLong(in[0]);
            long b  = Long.parseLong(in[1]);
            long total = GCD(a, b, 0);
            System.out.println(total);

        }
    }

    public static long GCD(long a, long b, long total) {
        if (a == 0) return total + b;
        else if (b == 0) return total;
        else return GCD(b, a%b, total + a/b);
    }

}
