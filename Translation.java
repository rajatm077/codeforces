/**
 * Created by MalhotR1 on 2/14/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Translation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] in = br.readLine().trim().toCharArray();
        char[] in2 = br.readLine().trim().toCharArray();
        if (in.length != in2.length) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < in.length; i++) {
            if (in[i] != in2[in.length - 1 - i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
