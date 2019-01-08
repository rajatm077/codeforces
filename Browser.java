/**
 * Created by MalhotR1 on 01/19/2018.
 * 915B
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Browser {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int pos = Integer.parseInt(in[1]);
            int l = Integer.parseInt(in[2]);
            int r = Integer.parseInt(in[3]);
//            int n = Integer.parseInt(in[0]);
            int sec = 0;
            if (l == 1 && r == n) {
                System.out.println(0);
                return;
            } else if (l == r) {
                sec = Math.abs(pos - l);
                if (l == 1 || l == n) sec++;
                else sec += 2;

            } else {
                if (l == 1) sec = 1 + Math.abs(r - pos);
                else if (r == n) sec = 1 + Math.abs(l - pos);

                else {
                    int leftdiff = Math.abs(pos - l);
                    int rightdiff = Math.abs(pos - r);
                    int min = Math.min(leftdiff, rightdiff);
                    sec = 2 + min + Math.abs(l - r);
                }
            }

            System.out.println(sec);

        }
    }

}
