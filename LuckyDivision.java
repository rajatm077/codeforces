/**
 * Created by MalhotR1 on 2/10/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LuckyDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[N];
        int j = 0;
        for (int i = 4; i <= N; i++) {
            if (i % 4 == 0 || i % 7 == 0) arr[j++] = i;
            else {
                int temp = i;
                boolean lucky = true;
                while (temp > 0) {
                    int rem = temp % 10;
                    if (rem != 4 && rem != 7) {
                        lucky = false;
                        break;
                    }
                    temp = temp / 10;
                }
                if (lucky) arr[j++] = i;
            }
        }
        for (int i = 0; i < j; i++) {
            if (N % arr[i] == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }
}
