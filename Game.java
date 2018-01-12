/**
 * Created by MalhotR1 on 2/8/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Game {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int[] arr = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            arr[i] = Integer.parseInt(in[i]);
        }
        if  (arr[0] > arr[1]) System.out.println("First");
            else  System.out.println("Second");
        }
    }

