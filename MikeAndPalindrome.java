/**
 * Created by MalhotR1 on 12/13/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MikeAndPalindrome {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] in = br.readLine().trim().toCharArray();
            int count = 0;
            int start = 0;
            int end = in.length - 1;
            while (start < end) {
                if (in[start] != in[end]) count++;
                if (count > 1) break;
                start++;
                end--;
            }

            if (count == 0) {
                if ((in.length & 1) == 0) System.out.println("NO");
                else System.out.println("YES");
            }
            else if (count == 1) System.out.println("YES");

            else System.out.println("NO");
        }
    }

}
