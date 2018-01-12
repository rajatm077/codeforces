/**
 * Created by MalhotR1 on 2/10/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Twins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        String[] in = br.readLine().trim().split(" ");
        int[] arr = new int[in.length];
        long sum = 0;
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(in[i]);
            sum += arr[i];
        }

        Arrays.sort(arr);
        long twin = 0;
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            twin += arr[i];
            sum -= arr[i];
            count++;
            if (sum < twin) break;
        }
        System.out.println(count);


    }
}
