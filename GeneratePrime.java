/**
 * Created by MalhotR1 on 2/15/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GeneratePrime {
    public static void main(String[] args) throws IOException {
        System.out.println("1 neither prime nor composite.");
        for (int t = 2; t < 100; t++) {
            if (t == 2 || t == 3) {
                System.out.println(t);
                continue;
            } else if (checkPrime(t)) {
                System.out.println(t);
            }
        }
    }

    private static boolean checkPrime(int n) {
        if (n % 2 == 0 || n % 3 == 0) return false;
        int k = (int) Math.sqrt(n) + 1;
        for (int i = 2; i < k; i++) {
            if (k % i == 0)
                return false;
        }
        return true;
    }
}
