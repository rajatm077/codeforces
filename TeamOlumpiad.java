/**
 * Created by MalhotR1 on 2/8/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TeamOlumpiad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String[] line = br.readLine().trim().split(" ");
        int[] arr = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        int cnt_1 = 0;
        int cnt_2 = 0;
        int cnt_3 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) cnt_1++;
            else if (arr[i] == 2) cnt_2++;
            else if (arr[i] == 3) cnt_3++;
        }

        int res = Math.min(cnt_3, Math.min(cnt_1, cnt_2));


        System.out.println(res);
    }
}
