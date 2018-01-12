/**
 * Created by MalhotR1 on 2/10/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Insomniacure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine().trim());
        int l = Integer.parseInt(br.readLine().trim());
        int m = Integer.parseInt(br.readLine().trim());
        int n = Integer.parseInt(br.readLine().trim());
        int d = Integer.parseInt(br.readLine().trim());

        int[] arr = new int[d];
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % k == 0 || (i + 1) % l == 0 || (i + 1) % m == 0 ||
                    (i + 1) % n == 0) arr[i] = 1;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) count++;
        }
        System.out.println(count);

    }
}
