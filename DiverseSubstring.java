/**
 * Created by MalhotR1 on 10/29/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DiverseSubstring {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String input = br.readLine().trim();
            char[] in = input.toCharArray();
            for (int i = 0; i < in.length - 1; i++) {
                if (in[i] != in[i+1]) {
                    System.out.println("YES");
                    String out = input.substring(i, i+2);
                    System.out.println(out);
                    return;
                }
            }
            System.out.println("NO");
        }
    }

}
