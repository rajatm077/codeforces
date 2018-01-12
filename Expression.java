/**
 * Created by MalhotR1 on 2/14/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Expression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine().trim());
        int b = Integer.parseInt(br.readLine().trim());
        int c = Integer.parseInt(br.readLine().trim());
        int max1 = ((a*b) > (a+b)) ? (a*b) : (a+b);
        int max2 = ((b*c) > (b+c)) ? (b*c) : (b+c);
        int res1 = ((max2 + a) > (max2 * a)) ? (max1 + a) : (max2 * a);
        int res2 = ((max1 + c) > (max1 * c)) ? (max1 + c) : (max1 * c);
        int res = (res1 > res2) ? res1 : res2;
        System.out.println(res);
    }
}
