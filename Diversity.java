/**
 * Created by MalhotR1 on 12/11/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Diversity {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] in = br.readLine().trim().toCharArray();
            int k = Integer.parseInt(br.readLine().trim());
            if (k > in.length) {
                System.out.println("impossible");
                return;
            }

            Set<Character> set = new HashSet<>();
            int count = 0;
            for (int i = 0; i < in.length; i++) {
                if (!set.contains(in[i])) {
                    set.add(in[i]);
                    count++;
                }
            }

            if (count >= k) System.out.println(0);
            else System.out.println(k - count);
        }
    }

}
