/**
 * Created by MalhotR1 on 05/08/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinksAndPearls {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] in = br.readLine().trim().toCharArray();
            int pcount = 0;
            int lcount = 0;
            for (int i = 0; i < in.length; i++) {
                if (in[i] == '-') lcount++;
                else pcount++;
            }

            if (pcount < 2 || (lcount % pcount == 0)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
