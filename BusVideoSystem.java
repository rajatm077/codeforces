/**
 * Created by MalhotR1 on 05/13/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BusVideoSystem {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int N = Integer.parseInt(in[0]);
            long w = Long.parseLong(in[1]);
            in = br.readLine().trim().split(" ");
            int[] arr = new int[N];

            long sum = 0;
            long temp = 0;
            boolean isPossible = true;
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
                sum += arr[i];
                temp = Math.abs(sum);
                if (temp > w) {
                    isPossible = false;
                    break;
                }
            }

            if (!isPossible) System.out.println(0);
            else {
                long present = 0;
                temp = 0;
                long tempn = 0;
                long max = 0;
                long min = 0;
                long maxPb = w + 1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0) {
                        tempn = 0;
                        temp += arr[i];
                        max = (max > temp) ? max : temp;
                    } else {
                        temp = 0;
                        tempn += arr[i];
                        min = (min < temp) ? min : temp;
                    }
                }

                min = Math.abs(min);
                max = (max > min) ? max : min;
                maxPb -=  max;
                System.out.println(maxPb);
            }

        }
    }

}
