import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MalhotR1 on 1/30/2017.
 */
public class WayTooLongWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < T; i++) {
            String res = "";
            char[] word = br.readLine().trim().toCharArray();
            if (word.length <= 10) {
                res = String.valueOf(word);
            }
            else {
                res = String.valueOf(word[0]) + (word.length - 2) + String.valueOf(word[word.length - 1]);
            }
            System.out.println(res);
        }

    }
}
