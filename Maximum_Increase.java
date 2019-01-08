/**
 * Created by MalhotR1 on 11/30/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Maximum_Increase {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int start = 0;
            int end = 0;
            int len = 0;
            int temp = 1;

            long crt = 0;
            long next = 0;
            for (int i = 0; i < in.length - 1; i++) {
                crt = Long.parseLong(in[i]);
                next = Long.parseLong(in[i+1]);
                if (next > crt) {
                    end = i + 1;
                    temp++;
                } else {
                    start = end = i;
                    temp = 1;
                }
                len = (temp > len) ? temp : len;
            }
            len = (temp > len) ? temp : len;
            System.out.println(len);
        }
    }

}
