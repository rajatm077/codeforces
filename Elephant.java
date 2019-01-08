import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MalhotR1 on 12/28/2017.
 */
public class Elephant {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int distance = Integer.parseInt(br.readLine());
            int total = distance /5;
            if (distance % 5 != 0) total++;
            System.out.println(total);
        }
    }
}
