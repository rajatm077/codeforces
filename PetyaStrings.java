/**
 * Created by MalhotR1 on 2/9/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PetyaStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] in = br.readLine().trim().toLowerCase().toCharArray();
        char[] in2 = br.readLine().trim().toLowerCase().toCharArray();

        for (int i = 0; i < in.length; i++) {
            if (in[i] < in2[i]) {
                System.out.println(-1);
                return;
            } else if (in[i] > in2[i]) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
