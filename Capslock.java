/**
 * Created by MalhotR1 on 2/9/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Capslock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();
        char[] in = line.toCharArray();
        boolean mistake = true;
        for (int i = 1; i < in.length; i++) {
            if (in[i] >= 97 && in[i] <=122) mistake = false;
        }

        if (mistake) {
            if (in[0] >= 97 && in[0] <=122) in[0] = (char) (in[0] - 32);
            else in[0] = (char) (in[0] + 32);

            for (int i = 1; i < in.length; i++) {
                in[i] = (char) (in[i] + 32);
            }
        }

        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i]);
        }
    }
}
