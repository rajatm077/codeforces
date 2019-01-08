/**
 * Created by MalhotR1 on 05/20/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Magnets {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            char[] arr = new char[2*T];
            for (int t = 0; t < T; t++) {
                String in = br.readLine().trim();
                arr[2*t] = in.charAt(0);
                arr[2*t + 1] = in.charAt(1);
            }

            int total = 1;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i+1]) total++;
            }
            System.out.println(total);
        }
    }

}
