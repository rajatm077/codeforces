/**
 * Created by MalhotR1 on 2/10/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BeautifulMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[5][5];
        int index_i = 0;
        int index_j = 0;
        for (int i = 0; i < 5; i++) {
            String[] in = br.readLine().trim().split(" ");
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(in[j]);
                if (arr[i][j] == 1) {
                    index_i = i + 1;
                    index_j = j + 1;
                }
            }
        }
        int res = Math.abs(3 - index_i) + Math.abs(3 - index_j);
        System.out.println(res);
    }
}
