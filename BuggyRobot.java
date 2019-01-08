/**
 * Created by MalhotR1 on 12/15/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BuggyRobot {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine().trim());
            char[] in = br.readLine().trim().toCharArray();
            int up = 0;
            int right = 0;
            for (int i = 0; i < in.length; i++) {
                if (in[i] == 'U')up++;
                else if (in[i] == 'D') up--;
                else if (in[i] == 'R') right++;
                else right--;
            }
            if (up > 0) up = -up;
            if (right > 0) right = -right;
            int total = Math.max(0, n + right + up);
            System.out.println(total);

        }
    }

}
