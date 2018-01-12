/**
 * Created by MalhotR1 on 2/9/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int x = 0;
        for (int t = 0; t < T; t++) {
            char[] in = br.readLine().trim().toCharArray();
            for (int i = 0; i < in.length; i++) {
                if (in[i] == '-') {
                    x--;
                    break;
                }
                else if (in[i] == '+') {
                    x++;
                    break;
                }
            }
        }
        System.out.println(x);
    }
}
