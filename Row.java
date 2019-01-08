/**
 * Created by MalhotR1 on 05/17/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Row {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            char[] in = br.readLine().trim().toCharArray();
            if (N == 1) {
                if (in[0] == '1') System.out.println("YES");
                else System.out.println("NO");

            } else {
                boolean maximal = true;
                int count = 0;
                for (int i = 0; i < in.length - 1; i++) {
                    if (in[i] == '1') count++;
                    if (in[i] == in[i+1] && in[i] == '1') {
                        maximal = false;
                        break;
                    }
                }
                if (!maximal) System.out.println("NO");
                else {
                    if (in[in.length - 1] == '1') count++;
                    int total = N / 2;
                    if (N % 2 == 0 && total == count) System.out.println("YES");
                    else if (N % 2 != 0 && ((count == total) || (count == total + 1))) System.out.println("YES");
                    else System.out.println("NO");
                }


            }
        }
    }

}
