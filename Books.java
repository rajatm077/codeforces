/**
 * Created by MalhotR1 on 05/16/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Books {
    public static void main(String[] args) throws IOException {



        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int f = Integer.parseInt(in[1]);
            in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            Arrays.sort(arr);
            int index = 0;
            while (index < arr.length && f > 0 && f >= arr[index]) {
                f -= arr[index];
                index++;
            }

            System.out.println(index);

        }
    }

}
