/**
 * Created by MalhotR1 on 01/03/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bus {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            boolean flag = false;
            char[][] sol = new char[N][5];
            for (int i = 0; i < N; i++) {
                sol[i] = br.readLine().trim().toCharArray();
                if (flag) continue;
                if (sol[i][0] == 'O' && sol[i][1] == 'O') {
                    flag = true;
                    sol[i][0] = sol[i][1] = '+';
                    continue;
                }
                if (sol[i][3] == 'O' && sol[i][4] == 'O') {
                    flag = true;
                    sol[i][3] = sol[i][4] = '+';
                }
            }
            if (!flag) System.out.println("NO");
            else {
                System.out.println("YES");
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(sol[i][j]);
                    }
                    System.out.println();
                }
            }
        }
    }

}
