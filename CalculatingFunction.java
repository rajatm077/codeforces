/**
 * Created by MalhotR1 on 2/14/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalculatingFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            long n = Long.parseLong(br.readLine().trim());
            long res = 0;
            if (n % 2 == 0) {
                res = n / 2;
            } else {
                res = (n + 1) / 2;
                res = -res;
            }
            System.out.println(res);
        }

}
