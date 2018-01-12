/**
 * Created by MalhotR1 on 2/9/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Taxi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        String[] in = br.readLine().trim().split(" ");
        int[] arr = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            arr[i] = Integer.parseInt(in[i]);
        }
        int cabs = 0;
        int sum = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] == 4) {
                cabs++;
                continue;
            }
            sum = arr[i];
            for (int j = 0; j < i; j++) {
                sum += arr[j];
                if (sum >= 4) {
                    cabs++;
                }
            }

        }


        System.out.println(cabs);

    }
}
