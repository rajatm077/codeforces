import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MalhotR1 on 1/30/2017.
 */
public class Watermelon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(br.readLine().trim());
        if (w != 2 && w % 2 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
