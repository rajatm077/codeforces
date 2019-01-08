/**
 * Created by MalhotR1 on 05/18/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IWBTG {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            String[] in2 = br.readLine().trim().split(" ");
            boolean[] arr = new boolean[N];

            int p = Integer.parseInt(in[0]);
            for (int i = 1; i < in.length; i++) {
                if (p == 0) break;
                int index = Integer.parseInt(in[i]) - 1;
                arr[index] = true;
            }

            int q = Integer.parseInt(in2[0]);
            for (int i = 1; i < in2.length; i++) {
                if (q == 0) break;
                int index = Integer.parseInt(in2[i]) - 1;
                arr[index] = true;
            }

            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == false) {
                    System.out.println("Oh, my keyboard!");
                    flag = false;
                    break;
                }
            }

            if (flag) System.out.println("I become the guy.");



        }
    }

}
