/**
 * Created by MalhotR1 on 05/09/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinBinaryString {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            char[] in = br.readLine().trim().toCharArray();
            int one = 0;

            for (int i = 0; i < in.length; i++) {
                if (in[i] == '1') one++;
            }

            if (one == 0) System.out.println(0);
            else {
                int count = in.length - one;
                System.out.print(1);
                for (int i = 0; i < count; i++) {
                    System.out.print(0);
                }
                System.out.println();
            }
        }
    }

}
