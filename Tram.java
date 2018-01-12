/**
 * Created by MalhotR1 on 2/9/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int max = Integer.MIN_VALUE;
        int inside = 0;
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            int dep = Integer.parseInt(in[0]);
            int arr = Integer.parseInt(in[1]);
            inside += arr - dep;
            if (inside > max) max = inside;
        }
        System.out.println(max);
    }
}
