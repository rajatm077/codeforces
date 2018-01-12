/**
 * Created by MalhotR1 on 2/8/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PoliceRecruits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int events = Integer.parseInt(br.readLine().trim());
        String[] input = br.readLine().trim().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int p_cnt = 0;
        int c_cnt = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1){
                if (p_cnt == 0) res++;
                else p_cnt--;
            } else {
                p_cnt += arr[i];
            }
        }
        System.out.println(res);
    }
}
