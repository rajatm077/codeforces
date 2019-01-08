/**
 * Created by MalhotR1 on 05/16/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GregWorkout {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[3];

            for (int i = 0; i < T; i++) {
                arr[i%3] += Integer.parseInt(in[i]);
            }

            if (arr[0] > arr[1] && arr[0] > arr[2]) System.out.println("chest");
            else if (arr[1] > arr[0] && arr[1] > arr[2]) System.out.println("biceps");
            else System.out.println("back");
        }
    }

}
