import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MalhotR1 on 12/29/2017.
 */
public class Pangram {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int length = Integer.parseInt(br.readLine().trim());
            if (length < 26) {
                System.out.println("NO");
                return;
            }
            int[] alpha = new int[26];
            char[] in = br.readLine().trim().toLowerCase().toCharArray();
//            if (in.length < 26) System.out.println("NO");
            for (int i = 0; i < in.length; i++) {
                alpha[in[i] - 97]++;
            }

            for (int i = 0; i < alpha.length; i++) {
                if (alpha[i] <= 0) {
                    System.out.println("NO");
                    return;
                }
            }

            System.out.println("YES");

        }
    }
}
