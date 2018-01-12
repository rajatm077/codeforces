/**
 * Created by malhotr1 on 2/13/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class BeautifulYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int year = T;
        int[] dig = new int[4];
        for (int i = year+1; i < Integer.MAX_VALUE; i++) {
            boolean dis = true;
            findDigits(dig, i);
            Arrays.sort(dig);
            for (int j = 0; j < 3; j++) {
                if (dig[j] == dig[j+1]) {
                    dis = false;
                    break;
                }
            }
            if (dis) {
                System.out.println(i);
                return;
            }
        }


    }

    private static void findDigits(int[] dig, int year) {
        int i = 1;
        while (year > 0) {
            dig[4 - i] = year % 10;
            year /= 10;
            i++;
        }
    }
}
