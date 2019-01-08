import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by MalhotR1 on 12/29/2017.
 */
public class GameWithSticks {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().trim().split(" ");
            int rows = Integer.parseInt(input[0]);
            int cols = Integer.parseInt(input[1]);
            int t = 1;
            int min = (Integer) Math.min(rows, cols);
            if (min % 2 == 0) System.out.println("Malvika");
            else System.out.println("Akshat");
        }
    }
}
