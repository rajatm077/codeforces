/**
 * Created by MalhotR1 on 05/13/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            HashSet<Integer> hs = new HashSet<>();
            for (int i = arr.length - 1; i >= 0; i--) {
                if (hs.contains(arr[i])) arr[i] = 0;
                else hs.add(arr[i]);
            }

            System.out.println(hs.size());
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) System.out.print(arr[i] + " ");
            }
        }
    }

}
