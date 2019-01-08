/**
 * Created by MalhotR1 on 01/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(br.readLine().trim());
            int[][] m = new int[n][n];
            for (int i = 0; i < n; i++) {
                m[i][0] = 1;
                m[0][i] = 1;
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    m[i][j] = m[i][j-1] + m[i-1][j];
                }
            }

            System.out.println(m[n-1][n-1]);

        }
    }

}
