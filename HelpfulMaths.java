/**
 * Created by MalhotR1 on 2/9/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class HelpfulMaths {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split("[+]");
        int[] arr = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            arr[i] = Integer.parseInt(in[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + "+");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
