/**
 * Created by MalhotR1 on 05/22/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Minesweeper {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            int[][] arr = new int[n][m];
            for (int i = 0; i < arr.length; i++) {
                in = br.readLine().trim().split("");
                for (int j = 0; j < arr[i].length; j++) {
                    if (in[j].equals(".")) arr[i][j] = 0;
                    else if (in[j].equals("*")) arr[i][j] = -1;
                    else arr[i][j] = Integer.parseInt(in[j]);
                }
            }
            boolean flag = true;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int count = arr[i][j];
                    if (count != -1) {
                        if (i-1 >= 0) {
                            if (arr[i-1][j] == -1) count--;
                            if (j > 0 && arr[i-1][j-1] == -1) count--;
                            if (j + 1 < arr[i].length && arr[i-1][j+1] == -1) count--;
                        }
                        if (count < 0) {
                            flag = false;
                            break;
                        }
                        if (i + 1 < arr.length) {
                            if (arr[i+1][j] == -1) count--;
                            if (j > 0 && arr[i+1][j-1] == -1) count--;
                            if (j + 1 < arr[i].length && arr[i+1][j+1] == -1) count--;
                        }
                        if (count < 0) {
                            flag = false;
                            break;
                        }

                        if (j > 0 && arr[i][j-1] == -1) count--;
                        if (j+1 < arr[i].length && arr[i][j+1] == -1) count--;
                        if (count != 0) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (!flag) break;
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
