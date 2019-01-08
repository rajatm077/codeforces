/**
 * Created by MalhotR1 on 05/18/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectPairs {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            long a = Long.parseLong(in[0]);
            long b = Long.parseLong(in[1]);
            long m = Long.parseLong(in[2]);
            if (a >= m || b >= m) System.out.println(0);
            else if (a <= 0 && b <= 0) System.out.println(-1);
            else {
                long count = 0;
                long[] arr = {Math.min(a,b), Math.max(a,b)};
                if (arr[0] < 0) {
                    long val = Math.abs(arr[0]);
                    count = val / arr[1];
                    if (val % arr[1] != 0) count++;
                    arr[0] += count*arr[1];

                    a = arr[0];
                    b = arr[1];
                }


                while (a < m && b < m) {
                    if (a < b) a += b;
                    else b += a;
                    count++;
                }
                System.out.println(count);

            }
        }
    }

}
