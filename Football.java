import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MalhotR1 on 12/29/2017.
 */
public class Football {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine().trim();
            if (input.length() < 7) {
                System.out.println("NO");
                return;
            }

            if (input.contains("0000000") || input.contains("1111111"))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
