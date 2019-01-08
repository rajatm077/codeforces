/**
 * Created by MalhotR1 on 05/22/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Game483 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[N];
            String[] in = br.readLine().trim().split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            if (N == 1) System.out.println(arr[0]);
            else {
                Arrays.sort(arr);
                int temp = (N-1)/2;
                System.out.println(arr[temp]);
            }
        }
    }

}
