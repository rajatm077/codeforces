/**
 * Created by MalhotR1 on 2/14/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class YoungPhysicst {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int[][] arr = new int[T][3];
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            for (int i = 0; i < in.length; i++) {
                arr[t][i] = Integer.parseInt(in[i]);
            }
        }

        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < T; i++) {
                sum += arr[i][j];
            }
            if (sum != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
