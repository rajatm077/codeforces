/**
 * Created by MalhotR1 on 2/10/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BoyOrGirl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] in = br.readLine().trim().toCharArray();
        int[] arr = new int[26];
        for (int i = 0; i < in.length; i++) {
            arr[in[i] - 97]++;
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)  cnt++;
        }

        if (cnt % 2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");

    }
}
