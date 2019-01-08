/**
 * Created by MalhotR1 on 04/26/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringSum {
    public static void main(String[] args) throws IOException {
        String s = "99";
        String a = "9";
        System.out.println(addStrings(a, s));
    }

    public static String addStrings(String num1, String num2) {
        if (num1 == null) return num2;
        else if (num2 == null) return num1;

        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        StringBuilder sb = new StringBuilder();

        int carry = 0;
        int i = n1.length - 1;
        int j = n2.length - 1;
        for (; i >= 0 && j >= 0; i--, j--) {
            int sum = (n1[i] - '0') + (n2[j] - '0') + carry;
            if (sum > 10) {
                carry = 1;
                sum -= 10;
            } else carry = 0;

            sb.append(sum);
        }

        char[] next = (n1.length > n2.length) ? n1 : n2;
        i = (i > j) ? i : j;
        while (i >= 0) {
            int sum = (next[i] - '0') + carry;
            if (sum >= 10) {
                carry = 1;
                sum -= 10;
            } else carry = 0;

            sb.append(sum);
            i--;
        }
        if (carry == 1) sb.append(1);
        return sb.reverse().toString();
    }

}
