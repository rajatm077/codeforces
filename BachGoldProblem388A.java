/**
 * Created by MalhotR1 on 02/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BachGoldProblem388A {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(br.readLine().trim());
            int reps = 0;
            reps = n / 2;
            System.out.println(reps);
            if (n % 2 != 0) {
                reps--;
            }

            for (int i = 0; i < reps; i++) {
                System.out.print(2 + " ");
                n -= 2;
            }
            if (n != 0) System.out.println(n);
        }
    }

}
