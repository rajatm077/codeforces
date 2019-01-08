/**
 * Created by MalhotR1 on 05/20/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] in = br.readLine().trim().toCharArray();
            int lc = 0;
            int uc = 0;
            for (int i = 0; i < in.length; i++) {
                if (in[i] >= 'a' && in[i] <= 'z') lc++;
                else uc++;
            }

            if (lc >= uc) System.out.println(String.valueOf(in).toLowerCase());
            else System.out.println(String.valueOf(in).toUpperCase());
        }
    }

}
