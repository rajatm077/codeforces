/**
 * Created by MalhotR1 on 12/17/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LettersRearranging {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                String in = br.readLine().trim();
                if (!isPallindrome(in)) System.out.println(in);
                else {
                    char[] out = in.toCharArray();
                    Arrays.sort(out);
                    String str = new String(out);
                    if (!isPallindrome(str)) System.out.println(str);
                    else System.out.println(-1);
                }

            }
        }
    }
    public static boolean isPallindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}
