import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by MalhotR1 on 01/01/2018.
 */
public class VanyaAndCards {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            String[] cards = br.readLine().trim().split(" ");
            int[] arr = new int[cards.length];

            int n = Integer.parseInt(in[0]);
            int x = Integer.parseInt(in[1]);
            int sum = 0;
            for (int i = 0; i < cards.length; i++) {
                arr[i] = Integer.parseInt(cards[i]);
                if (arr[i] == 0) n--;
                sum += arr[i];
            }

            sum = (Integer) Math.abs(sum);
            if (sum == 0) System.out.println(0);
            else if (sum <= x) System.out.println(1);
            else {
                int count = 0;
                while (sum > 0) {
                    count = sum / x;
                    sum = sum % x;
                    if (sum < x && sum != 0) {
                        count++;
                        break;
                    }
                    x--;
                }
                System.out.println(count);
            }

        }
    }
}
