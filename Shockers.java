/**
 * Created by MalhotR1 on 02/05/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Shockers {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] al = new int[26];
            for (int i = 0; i < al.length; i++) {
                al[i] = 99;
            }

            int cnt = 0;
            boolean firstSchock = true;
            boolean unique = false;
            int shocks = 0;
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                String[] in = br.readLine().trim().split(" ");
                char[] w = in[1].toCharArray();
                if (in[0].equals("!")) {
                    if (firstSchock) {
                        for (int i = 0; i < w.length; i++) {
                            al[i] = w[i] - 97;
                        }
                    }
                }
            }
            System.out.println(shocks );
        }
    }

}
