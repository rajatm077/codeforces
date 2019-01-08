/**
 * Created by MalhotR1 on 01/01/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HolidayOfEqualities {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            if (n == 1) {
                System.out.println(0);
                return;
            }

            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            Arrays.sort(arr);
            int max = arr[arr.length - 1];
            int total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += max - arr[i];
            }
            System.out.println(total);
        }
    }

}
