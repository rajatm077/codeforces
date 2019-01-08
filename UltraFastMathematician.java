/**
 * Created by MalhotR1 on 05/18/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UltraFastMathematician {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] one = br.readLine().trim().toCharArray();
            char[] two = br.readLine().trim().toCharArray();

            for (int i = 0; i < one.length; i++) {
                if (one[i] != two[i]) one[i] = '1';
                else one[i] = '0';
            }

            System.out.println(String.valueOf(one));


        }
    }

}
