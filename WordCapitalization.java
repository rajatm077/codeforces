/**
 * Created by MalhotR1 on 2/10/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WordCapitalization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] in = br.readLine().trim().toCharArray();
        if (in[0] >= 97 && in[0] <= 122) in[0] = (char) (in[0] - 32);
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i]);
        }
    }
}
