/**
 * Created by MalhotR1 on 05/20/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DesignTutorial {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            Integer N = br.readLine().trim().split(" ");
            int n = Integer.parseInt(br.readLine().trim());
                int k = n >> 1;
                if (n % 2 == 0) {
                    if (isPrime(k)) {
                        k--;
                        System.out.println(k + " " + (n - k));
                    } else {
                        System.out.println(k + " " + k);
                    }
                } else {
                    int last = 0;
                    if (n < 50) last = k + 1;
                    else last = (int) Math.sqrt(n) + 1;
                    int[] arr = new int[last];
                    for (int j = 2; j < arr.length; j++) {
                        if (j <= 3) {
                            arr[j] = -1;
                        }
                        for (int l = j + 2; l < arr.length; l += 2) {
                            if (l % j == 0) arr[l] = 1;
                        }
                    }

                    for (int j = 4; j < arr.length; j++) {
                        if (arr[j] == 1 && !isPrime(n - j)) {
                            System.out.println(j + " " + (n - j));
                            break;
                        }
                    }

                }
            }
        }

    private static boolean isPrime(int k) {
        int sq = (int) Math.sqrt(k);
        for (int i = 2; i <= sq; i++) {
            if (k % i == 0) return false;
        }
        return true;
    }

}
