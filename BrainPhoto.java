/**
 * Created by MalhotR1 on 2/7/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BrainPhoto {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] pixel = br.readLine().trim().split(" ");
        int n = Integer.parseInt(pixel[0]);
        int m = Integer.parseInt(pixel[1]);
        String[][] matrix = new String[n][m];
        for (int i = 0; i < n; i++) {
            matrix[i] = br.readLine().trim().split(" ");
        }

        boolean color = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               if (matrix[i][j].equals("C") || matrix[i][j].equals("M") || matrix[i][j].equals("Y")) {
                   color = true;
                   break;
               }
            }
        }

        if (color) System.out.println("#Color");
        else System.out.println("#Black&White");


    }
}
