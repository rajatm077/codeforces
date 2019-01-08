/**
 * Created by MalhotR1 on 02/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SwapAdjacent {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            char[] in2 = br.readLine().trim().toCharArray();
            int[] arr = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            int start = -1;
            int end = 0;
            for (int i = 0; i < in2.length; i++) {
                if (in2[i] == '1' && (i == 0 || in2[i-1] == '0')) {
                   start = i;
                } if (start >= 0 && in2[i] == '0') {
                    end = i + 1;
                    Arrays.sort(arr, start, end);
                    start = 0;
                }
            }
            if (start > 0) {
                end = arr.length;
                Arrays.sort(arr, start, end);
                start = 0;
            }


            boolean flag = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");

        }
    }

}


