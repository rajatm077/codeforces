/**
 * Created by MalhotR1 on 05/18/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringsOfPower {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine().trim();
            char[] in = input.toCharArray();
            char[] h = "heavy".toCharArray();
            char[] m = "metal".toCharArray();

            int hc = 0;
            long count = 0;
            for (int i = 0; i < in.length - 4;) {
                if (in[i] == 'h') {
                    int k = checkSubstr(in, h, i);
                    if (k == i + 5) hc++;
                    i = k;
                }
                else if (in[i] == 'm') {
                    int k = checkSubstr(in, m, i);
                    if (k == i + 5) {
                        count += hc;
                    }
                    i = k;
                }
                else {
                    i++;
                }
            }
            System.out.println(count    );

        }
    }

    private static int checkSubstr(char[] in, char[] m, int i) {
        int j = i;
        for (; j < i + 5; j++) {
            if (in[j] != m[j-i]) return j;
        }
        return j;
    }

}
