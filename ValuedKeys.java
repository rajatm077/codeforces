/**
 * Created by MalhotR1 on 12/11/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ValuedKeys {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            char[] x = br.readLine().trim().toCharArray();
            char[] y = br.readLine().trim().toCharArray();

            boolean np = false;
            for (int i = 0; i < x.length; i++) {
                if (y[i] > x[i]) {
                    np = true;
                    break;
                }
            }

            if (!np) System.out.println(y);
            else System.out.println(-1);
        }
    }

}
