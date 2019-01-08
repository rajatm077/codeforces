/**
 * Created by MalhotR1 on 12/11/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximumOfMaximumsOfMinimums {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int k = Integer.parseInt(in[1]);
            in = br.readLine().trim().split(" ");
            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;
            long[] arr = new long[n];

            for (int i = 0; i < in.length; i++) {
                arr[i] = Long.parseLong(in[i]);
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }

            if (k == 1) System.out.println(min);
            else if (k == 2) System.out.println(arr[0] > arr[arr.length - 1] ? arr[0]: arr[arr.length - 1]);

            else System.out.println(max);

        }
    }

}
