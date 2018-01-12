/**
 * Created by MalhotR1 on 2/10/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ChatRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] in = br.readLine().trim().toCharArray();
        boolean[] hello = new boolean[5];

        for (int i = 0; i < in.length; i++) {
            if (in[i] == 'h' && !hello[0]) {
                hello[0] = true;
            }
            else if (hello[0]&& in[i] == 'e') hello[1] = true;
            else if (hello[1] && in[i] == 'l') {
                if (hello[2]) hello[3] = true;
                else hello[2] = true;
            }
            else if (hello[3] && in[i] == 'o') hello[4] = true;
        }

        for (int i = 0; i < 5; i++) {
            if (!hello[i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
