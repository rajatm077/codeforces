/**
 * Created by MalhotR1 on 05/18/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrivalOfheGeneral {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[N];

            int max_i = -1;
            int max = Integer.MIN_VALUE;

            int min_i = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
                if (arr[i] > max) {
                    max = arr[i];
                    max_i = i;
                }

                if (arr[i] <= min) {
                    min = arr[i];
                    min_i = i;
                }
            }

            int ts = max_i + N - min_i - 1;
            if (max_i > min_i) ts--;
            System.out.println(ts);
        }
    }

}
