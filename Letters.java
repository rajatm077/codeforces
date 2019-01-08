/**
 * Created by MalhotR1 on 05/13/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Letters {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int a = Integer.parseInt(in[0]);
            int b = Integer.parseInt(in[1]);
            in = br.readLine().split(" ");
            long[] dorm = new long[in.length];
            long sum = 0;
            for (int i = 0; i < in.length; i++) {
                dorm[i] = Long.parseLong(in[i]) + sum;
                sum = dorm[i];
            }
            
            in = br.readLine().trim().split(" ");
            long[] arr = new long[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Long.parseLong(in[i]);
            }


            int next = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= dorm[next]) {
                    long r = arr[i];
                    if (next != 0) r = r - dorm[next - 1];
                    System.out.println((next + 1) + " " + r);
                } else {
                    while (next < dorm.length && dorm[next] < arr[i]) next++;
                    long r = arr[i] - dorm[next - 1];
                    System.out.println((next + 1) + " " + r);
                }
            }
        }
    }
}
