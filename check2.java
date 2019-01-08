/**
 * Created by MalhotR1 on 01/09/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class check2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int N = Integer.parseInt(br.readLine().trim());
            int cnt = 0;
            while (N-- > 0) {
               int n = Integer.parseInt(br.readLine().trim());
               if (n == -1) break;
               cnt++;
            }
            System.out.println(cnt);
        }
    }

}
