/**
 * Created by MalhotR1 on 01/04/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GeorgeAndJob {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            String[] in2 = br.readLine().trim().split(" ");
            int[] arr = new int[in2.length];
            for (int i = 0; i < in2.length; i++) {
                arr[i] = Integer.parseInt(in2[i]);
            }
            Arrays.sort(arr);

            int n = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            int k = Integer.parseInt(in[2]);

            int sum = 0;
            int length = k*m;
            if (length > arr.length) length = arr.length;
            for (int i = arr.length - 1; i >= 0 && length > 0; i--, length--) {
                sum += arr[i];
            }
            System.out.println(sum);

        }
    }

}
