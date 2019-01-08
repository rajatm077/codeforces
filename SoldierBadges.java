/**
 * Created by MalhotR1 on 05/11/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class SoldierBadges {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            Arrays.sort(arr);
            int[] sol = new int[arr.length];
            sol[0] = arr[0];
            int total = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] <= sol[i-1]) {
                    sol[i] = sol[i-1] + 1;
                    total += sol[i] - arr[i];
                } else  {
                    sol[i] = arr[i];
                }
            }

            System.out.println(total);

        }
    }

}
