/**
 * Created by MalhotR1 on 01/03/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChrisMagicSquare {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[N][N];
            int sum = -1;
            int z_i = -1;
            int z_j = -1;
            boolean zero = false;

            for (int i = 0; i < N; i++) {
                String[] in = br.readLine().trim().split(" ");
                int temp = 0;
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = Integer.parseInt(in[j]);
                    if (matrix[i][j] == 0) {
                        zero = true;
                        z_i = i;
                        z_j = j;
                    }
                    temp += matrix[i][j];
                }
                if (sum == -1 && !zero) sum = temp;
                if (sum != -1 && !zero && sum != temp) {
                    System.out.println(-1);
                    return;
                }
                if (sum != -1 && zero) matrix[z_i][z_j] = sum - temp;
                zero = false;
            }

            if (N == 1) {
                System.out.println(1);
                return;
            }

            int c = 0;
            for (int i = 0; i < N; i++) {
                c += matrix[z_i][i];
            }
            if (matrix[z_i][z_j] == 0)
                matrix[z_i][z_j] = sum - c;

            if (matrix[z_i][z_j] == 0){
                System.out.println(-1);
                return;
            }


            int diag = 0;
            int diag2 = 0;
            for (int i = 0; i < N; i++) {
                int temp = 0;
                diag2 += matrix[i][N-1-i];
                for (int j = 0; j < N; j++) {
                    temp += matrix[j][i];
                    if (i == j) diag += matrix[i][j];
                }
                if (temp != sum) {
                    System.out.println(-1);
                    return;
                }
            }
            if (diag != sum || diag2 != sum) {
                System.out.println(-1);
                return;
            }

            System.out.println(matrix[z_i][z_j]);


        }
    }

}
