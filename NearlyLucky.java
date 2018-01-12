/**
 * Created by MalhotR1 on 2/10/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NearlyLucky {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] in = br.readLine().trim().toCharArray();
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == '4' || in[i] == '7') count++;
        }
        if (count == 0 ) {
            System.out.println("NO");
            return;
        }
        while (count > 0) {
            int rem = count % 10;
            if (rem != 4 && rem != 7) {
                System.out.println("NO");
                return;
            }
            count /= 10;
        }
        System.out.println("YES");
    }
}
