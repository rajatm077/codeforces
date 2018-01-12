/**
 * Created by MalhotR1 on 2/10/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HQ9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] in = br.readLine().trim().toCharArray();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 'H' || in[i] == 'Q' || in[i] == '9')
            {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }
}
