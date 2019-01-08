/**
 * Created by MalhotR1 on 12/10/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class LinelandMail {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());
            String[] in = br.readLine().trim().split(" ");
            ArrayList<Long> al = new ArrayList<>();
            for (int i = 0; i < in.length; i++) {
                al.add(Long.parseLong(in[i]));
            }

            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
            for (int i = 0; i < al.size(); i++) {
                if (i == 0) {
                    min = al.get(i+1) - al.get(i);
                    max = al.get(N - 1) - al.get(i);
                } else if ( i == N-1) {
                    min = al.get(i) - al.get(i-1);
                    max = al.get(i) - al.get(0);
                } else {
                    min = Math.min(al.get(i) - al.get(i-1), al.get(i+1) - al.get(i));
                    max = Math.max(al.get(i) - al.get(0), al.get(N-1) - al.get(i));
                }
                System.out.println(min + " " + max);

            }
        }
    }

}
