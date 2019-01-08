/**
 * Created by MalhotR1 on 01/03/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Queue {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[N][2];
            int[] sol = new int[N];
            int count = 0;
            for (int i = 0; i < N; i++) {
                String[] in = br.readLine().trim().split(" ");
                arr[i][0] = Integer.parseInt(in[0]);
                arr[i][1] = Integer.parseInt(in[1]);

                if (arr[i][0] == 0) {
                    sol[1] = arr[i][1];
                    arr[i][0] = -1;
                    arr[i][1] = -1;
                }

                if (arr[i][1] == 0) {
                    sol[N-2] = arr[i][0];
                    arr[i][0] = -1;
                    arr[i][1] = -1;
                }
            }
            if (2 == N) {
                PrintSol(sol);
                return;
            }

            if (N == 3) {
                for (int i = 0; i < N; i++) {
                    if (arr[i][0] != 0 && arr[i][1] != 0) {
                        sol[0] = arr[i][0];
                        sol[2] = arr[i][1];
                    }
                }
                PrintSol(sol);
                return;
            }





            PrintSol(sol);

        }
    }

    private static void PrintSol(int[] sol) {
        for (int i = 0; i < sol.length; i++) {
            System.out.print(sol[i] + " ");
        }
    }

}
