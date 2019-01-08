/**
 * Created by MalhotR1 on 11/30/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Cakeminator {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int rows = Integer.parseInt(in[0]);
            int cols = Integer.parseInt(in[1]);
            char[][] matrix = new char[rows][cols];
            boolean[] rb = new boolean[rows];
            boolean[] cb = new boolean[cols];
            for (int i = 0; i < matrix.length; i++) {
                matrix[i] = br.readLine().toCharArray();
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 'S') {
                        rb[i] = true;
                        cb[j] = true;
                    }
                }
            }

            int totalrows = rows;
            int totalcols = cols;
            for (int i = 0; i < rb.length; i++) {
                if (rb[i]) rows--;
            }
            for (int i = 0; i < cb.length; i++) {
                if (cb[i]) cols--;
            }

            int count = rows * totalcols  + cols * (totalrows - rows);

            System.out.println(count);
        }
    }

}
