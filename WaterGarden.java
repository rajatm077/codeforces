/**
 * Created by MalhotR1 on 02/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterGarden {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                String[] in2 = br.readLine().trim().split(" ");
                int n = Integer.parseInt(in2[0]);
                int k = Integer.parseInt(in2[1]);
                String[] in = br.readLine().trim().split(" ");
                if (n == k) {
                    System.out.println(1);
                    continue;
                }
                
                int[] arr = new int[n];
                int[] tap = new int[k];
                int cnt = n;
                for (int i = 0; i < in.length; i++) {
                    tap[i] = Integer.parseInt(in[i]) - 1;
                    arr[tap[i]] = 1;
                    cnt--;
                }

                int time = 2;

                while (true) {
                    for (int i = 0; i < tap.length; i++) {
                        int i1 = tap[i] - time + 1;
                        int i2 = tap[i] + time - 1;
                        if (i1 >=0 && arr[i1] == 0) {
                            arr[i1] = 1;
                            cnt--;
                        }
                        if (i2 < arr.length && arr[i2] == 0) {
                            arr[i2] = 1;
                            cnt--;
                        }
                    }
                    if (cnt <= 0) break;
                    time++;
                }
                System.out.println(time);
            }
        }
    }

}
