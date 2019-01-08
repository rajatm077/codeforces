/**
 * Created by MalhotR1 on 05/16/2018.
 */
// TLE

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeParsing {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] in = br.readLine().trim().toCharArray();
            long cx = 0;
            for (int i = 0; i < in.length; i++) {
                if (in[i] == 'x') cx++;
                else cx--;
            }


            if (cx > 0) {
                for (int i = 0; i < cx; i++) {
                    System.out.print('x');
                }
            } else {
                cx = -cx;
                for (int i = 0; i < cx; i++) {
                    System.out.print('y');
                }
            }
        }
    }

}
