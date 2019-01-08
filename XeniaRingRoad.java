/**
 * Created by MalhotR1 on 01/04/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XeniaRingRoad {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            String[] in2 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            int[] arr = new int[in2.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in2[i]);
            }

            int crr = 1;
            int dest = 0;
            long total = 0;
            for (int i = 0; i < arr.length; i++) {
                dest = arr[i];
                total += (dest - crr + n) % n;
                crr = dest;
            }
            System.out.println(total);

        }
    }

}
