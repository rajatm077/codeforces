/**
 * Created by MalhotR1 on 01/04/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FedorAndNewGame {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            int k = Integer.parseInt(in[2]);
            int friends = 0;
            int[] p = new int[m];
            for (int i = 0; i < m; i++) {
                p[i] = Integer.parseInt(br.readLine().trim());
            }
            int fed = Integer.parseInt(br.readLine().trim());
            for (int i = 0; i < m; i++) {
                int diff = fed ^ p[i];
                int count = 0;
                while (diff > 0) {
                    diff = diff & (diff-1);
                    count++;
                }
                if (count <= k) friends++;
            }
            System.out.println(friends);
        }
    }

}
