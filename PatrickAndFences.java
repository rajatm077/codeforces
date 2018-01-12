/**
 * Created by MalhotR1 on 2/6/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PatrickAndFences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split(" ");
        long d1 = Long.parseLong(input[0]);
        long d2 = Long.parseLong(input[1]);
        long d3 = Long.parseLong(input[2]);

        long[][] distance = new long[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) distance[i][j] = 0;
                else {
                    //distance[i][j] = Math.min()
                }
            }
        }
    }
}
