/**
 * Created by MalhotR1 on 2/17/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RegistrationSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> lookup = new HashMap<>();
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String in = br.readLine().trim();
            if (lookup.containsKey(in)) {
                System.out.println(in + lookup.get(in));
                lookup.replace(in, lookup.get(in),lookup.get(in) + 1);
            } else {
                System.out.println("OK");
                lookup.put(in, 1);
            }
        }
    }
}
