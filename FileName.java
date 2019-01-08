/**
 * Created by MalhotR1 on 05/13/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileName {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            char[] in = br.readLine().trim().toCharArray();

            int i = 0;
            int total = 0;
            while (i < in.length) {
                if (in[i] == 'x') {
                    int j = i+1;
                    while (j < in.length && in[j] == 'x') j++;
                    if (j - i > 2) total += j - i - 2;
                    i = j;
                }
                else  {
                    i++;
                }
            }

            System.out.println(total);
        }
    }

}
