/**
 * Created by MalhotR1 on 05/11/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaisaandPylons {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[N];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            int energy = arr[0];
            int gains = 0;
            int loss = 0;
            for (int i = 1; i < arr.length; i++) {
                int val = arr[i- 1] - arr[i];
                if (val > 0) gains += val;

                else {
                    gains += val;
                    if (gains < 0) {
                        energy += Math.abs(gains);
                        gains = 0;
                    }
                }
            }
            System.out.println(energy);
        }
    }

}
