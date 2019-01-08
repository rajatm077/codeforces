/**
 * Created by MalhotR1 on 05/20/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IQTest {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[N];
            String[] in = br.readLine().trim().split(" ");
            int to = 0;
            int te = 0;
            int lo = -1;
            int le = -1;

            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
                if ((arr[i] & 1) == 0) { te++; le = i+1;}
                else { to++; lo = i+1; }
            }

            if (to > te) System.out.println(le);
            else System.out.println(lo);
        }
    }

}
