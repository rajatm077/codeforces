import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MalhotR1 on 1/30/2017.
 */
public class StringTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().trim().toLowerCase().toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'a' || input[i] == 'e' || input[i] == 'o'
                    || input[i] == 'u' || input[i] == 'i' || input[i] == 'y') continue;
            else {
                res.append('.');
                res.append(input[i]);
            }
        }
        System.out.println(res);
    }
}
