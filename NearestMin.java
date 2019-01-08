/**
 * Created by MalhotR1 on 01/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearestMin {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            long[] arr = new long[N];
            long min = Long.MAX_VALUE;
            int dis = 0;
            int temp = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                arr[i] = Long.parseLong(in[i]);
                if (min > arr[i]) {
                    min = arr[i];
                    dis = 0;
                    temp = 0;
                } else if (min == arr[i]) {
                    temp++;
                    if (dis == 0) dis = temp;
                    else dis = Math.min(dis, temp);
                    temp = 0;
                }
                else {
                    temp++;
                }
            }
            System.out.println(dis);
        }
    }

}
