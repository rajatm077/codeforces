/**
 * Created by MalhotR1 on 05/13/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MahmoudTriangle {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            long[] arr = new long[in.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Long.parseLong(in[i]);
            }

            Arrays.sort(arr);
            boolean isPossible = false;
            for (int i = 0; i < arr.length - 2; i++) {
                long a = arr[i] + arr[i+1];
                long c = arr[i+2];
                if (a > c) {
                    isPossible = true;
                    break;
                }
            }
            if (isPossible) System.out.println("YES");
            else System.out.println("NO");

        }
    }

}
