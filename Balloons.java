/**
 * Created by MalhotR1 on 12/11/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Balloons {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            if (N == 1) {
                System.out.println(-1);
                return;
            }
            if (N == 2 && in[0].equals(in[1])) {
                System.out.println(-1);
                return;
            }
            
            int[] arr = new int[N];
            long leftSum = 0;
            long rightSum = 0;
            int mid = N / 2;
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
                if (i < mid) rightSum += arr[i];
                else leftSum += arr[i];
            }
            while (rightSum == leftSum && mid < arr.length) {
                rightSum += arr[mid];
                leftSum -= arr[mid];
                mid++;
            }

            System.out.println(mid);
            for (int i = 0; i < mid; i++) {
                int k = i + 1;
                System.out.print(k + " ");
            }


        }
    }

}
