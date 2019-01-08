/**
 * Created by MalhotR1 on 05/09/2018.
 */

//TODO: Not Solved.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marlin {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int k = Integer.parseInt(in[1]);
            int possible = 2 * (n - 2);

        }
    }

}
