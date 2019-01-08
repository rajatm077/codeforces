/**
 * Created by MalhotR1 on 01/04/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buttons {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int N = Integer.parseInt(br.readLine().trim());
            long total = 0;
            for (int i = 0; i < N; i++) {
                total += (N-i) + i*(N-i-1);

            }
            System.out.println(total);
        }
    }

}
