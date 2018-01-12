import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MalhotR1 on 1/30/2017.
 */
public class TheatreSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().trim().split(" ");
        long n = Long.parseLong(line[0]);
        long m = Long.parseLong(line[1]);
        long a = Long.parseLong(line[2]);

        long res = ((n + a - 1) /a) * ((m + a - 1) / a);
        System.out.println(res);
    }
}
