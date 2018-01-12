/**
 * Created by MalhotR1 on 2/14/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KefaAndFirstSteps {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String[] in = br.readLine().trim().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(in[i]);
        }
        int length = 1;
        int max = 1;
        for (int i = 1; i < N; i++) {
            if (arr[i] < arr[i-1]) {
                length = 1;
            } else {
                length++;
                if (length > max) max = length;
            }
        }
        System.out.println(max);
    }
}
