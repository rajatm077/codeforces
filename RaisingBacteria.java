import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by MalhotR1 on 1/30/2017.
 */
public class RaisingBacteria {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        if (N == 1) System.out.println(N);
        else if ((N & N - 1) == 0) System.out.println(1);
        else {
            int cnt = 0;
            while (N > 0) {
                int res = (int) (Math.log(N) / Math.log(2));
                N = N - (long) Math.pow(2, res);
                cnt++;
            }
            System.out.println(cnt);
        }

    }
}
