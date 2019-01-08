/**
 * Created by MalhotR1 on 05/11/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VanyaAndBooks {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Long N = Long.parseLong(br.readLine().trim());
            if (N < 10) System.out.println(N);
            else {
                int length = getLength(N);
                long total = 9;
                for (int i = 2; i < length; i++) {
                    total += (Math.pow(10, i) - Math.pow(10, i - 1)) * (i);
                }

                total += (N - Math.pow(10, length - 1) + 1) * (length);
                System.out.println(total);

            }
        }
    }

    private static int getLength(Long n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

}
