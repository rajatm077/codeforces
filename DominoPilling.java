/**
 * Created by MalhotR1 on 2/9/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DominoPilling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int M = Integer.parseInt(in[0]);
        int N = Integer.parseInt(in[1]);
        int larger = (M > N) ? M : N;
        int smaller = M + N - larger;
        int total = smaller + larger / 2 - 1;
        System.out.println(total);
    }
}
