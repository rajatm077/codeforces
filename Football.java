/**
 * Created by MalhotR1 on 2/9/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Football {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split("");
        if (in.length < 7) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < in.length - 1; ) {
            int cnt = 1;
            for (int j = i+1; j < in.length; j++) {
                if (in[i].equals(in[j])) {
                    cnt++;
                    if (cnt == 7) {
                        System.out.println("YES");
                        return;
                    }
                    else  i = j;

                }

            }
        }
        System.out.println("NO");

    }
}
