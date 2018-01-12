import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MalhotR1 on 2/6/2017.
 */
public class CaseOfZeroAndOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine().trim());
        char[] in = br.readLine().trim().toCharArray();
        int cnt_0 = 0;
        int cnt_1 = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == '0') cnt_0++;
            else if (in[i] == '1') cnt_1++;
        }
        int cnt = (cnt_0 < cnt_1) ? cnt_0 : cnt_1;
        System.out.println(in.length - 2 * cnt);
    }
}
