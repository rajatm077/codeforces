/**
 * Created by MalhotR1 on 2/1/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FancyFence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < T; i++) {
            int theta = Integer.parseInt(br.readLine().trim());
            int diff = 180 - theta;
            if (360 % diff == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
