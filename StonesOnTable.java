/**
 * Created by MalhotR1 on 2/9/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StonesOnTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        char[] in = br.readLine().trim().toCharArray();
        int cnt = 0;
        int i = 0;
        while (i < in.length - 1) {
            char color = in[i];
            int j = i+1;
            while (j < in.length) {
                if (color == in[j]) {
                    cnt++;
                    j++;
                }
                else break;
            }
            i = j;
        }
        System.out.println(cnt);
    }
}
