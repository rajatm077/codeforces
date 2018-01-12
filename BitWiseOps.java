/**
 * Created by MalhotR1 on 1/31/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;

public class BitWiseOps {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(7&6); //BitWise And operation.

        //Checking output of Math.log(int) operation.
        int cnt = 0;
        long N = 536870911;
        while (N > 0) {
            int res = (int) (Math.log(N) / Math.log(2));
            N = N - (long) Math.pow(2, res);
            cnt++;
        }
        System.out.println(cnt);

    }
}
