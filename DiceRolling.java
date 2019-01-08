/**
 * Created by MalhotR1 on 12/17/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DiceRolling {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                if (N > 3 && N < 8) System.out.println(1);
                else if (N % 2 == 0) System.out.println(N / 2);
                else {
                    N -= 3;
                    int total = N / 2 + 1;
                    System.out.println(total);
                }
            }
        }
    }

}
