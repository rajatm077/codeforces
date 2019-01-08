/**
 * Created by MalhotR1 on 12/10/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArpaHardExam {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Long n = Long.parseLong(br.readLine().trim());
            if (n == 0) System.out.println(1);
            else if (n == 1) System.out.println(8);
            else {
                if (n % 4 == 0) System.out.println(6);
                else if (n % 4 == 1) System.out.println(8);
                else if (n % 4 == 2) System.out.println(4);
                else System.out.println(2);
            }
        }
    }
}
