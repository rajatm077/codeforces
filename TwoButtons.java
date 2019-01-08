import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MalhotR1 on 12/29/2017.
 */
public class TwoButtons {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            if (m <= n) {
                System.out.println(n - m);
                return;
            }

            int count = 0;
            while (m != n && m > n) {
                if (m%2 == 0) m = m / 2;
                else m += 1;
                count++;
            }
            count += n - m;
            System.out.println(count);
        }
    }
}
