/**
 * Created by MalhotR1 on 05/11/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewyearDays {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int val = Integer.parseInt(in[0]);
            if (in[2].equals("month")) {
                if (val < 30) System.out.println("12");
                else if (val == 30) System.out.println(11);
                else System.out.println(7);
            } else {
                if (val < 5 || val == 7) System.out.println(52);
                else System.out.println(53);
            }

        }
    }

}
