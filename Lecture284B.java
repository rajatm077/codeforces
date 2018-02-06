/**
 * Created by MalhotR1 on 02/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Lecture284B {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            HashMap<String, String> hm = new HashMap<>();
            for (int i = 0; i < m; i++) {
                in = br.readLine().trim().split(" ");
                if (in[0].length() <= in[1].length()) {
                    hm.put(in[0], in[0]);
                } else {
                    hm.put(in[0], in[1]);
                }
            }

            in = br.readLine().trim().split(" ");
            for (String str : in) {
                System.out.print(hm.get(str) + " ");
            }

        }
    }

}
