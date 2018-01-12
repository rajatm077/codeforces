/**
 * Created by MalhotR1 on 2/14/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Presents {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String[] in = br.readLine().trim().split(" ");
        int[] arr = new int[N];
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(in[i]);
            lookup.put(arr[i], i+1);
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(lookup.get(i) + " ");
        }
    }
}
