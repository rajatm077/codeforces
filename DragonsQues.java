/**
 * Created by MalhotR1 on 12/10/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DragonsQues {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            long s = Long.parseLong(in[0]);
            int n = Integer.parseInt(in[1]);
            ArrayList<Dragons> dragons = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                in = br.readLine().trim().split(" ");
                Dragons d = new Dragons();
                d.str = Integer.parseInt(in[0]);
                d.bonus = Integer.parseInt(in[1]);
                dragons.add(d);
            }

            Collections.sort(dragons, (d1, d2) -> d1.str - d2.str);
            long last = dragons.get(n-1).str;

            boolean win = false;
            for (int i = 0; i < n; i++) {
                Dragons d = dragons.get(i);
                if (s < d.str) {
                    win = false;
                    break;
                }

                if (s > d.str) {
                    s += d.bonus;
                }

                if (s > last) {
                    win = true;
                    break;
                }
            }
            if (win) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}

class Dragons {
    int str;
    int bonus;
}
