/**
 * Created by MalhotR1 on 01/04/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HelpfulMaths {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] in = br.readLine().trim().toCharArray();
            int[] arr = new int[in.length/2 + 1];
            int cnt = 0;
            for (int i = 0, k =0; i < in.length && k < arr.length; i++) {
                if (in[i] != '+') {
                    cnt++;
                    arr[k++] = in[i] - 48;
                }
            }
            Arrays.sort(arr);
            for (int i = 0; i < cnt-1; i++) {
                System.out.print(arr[i] + "+");
            }
            System.out.println(arr[cnt-1]);
        }
    }

}
