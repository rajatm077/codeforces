/**
 * Created by MalhotR1 on 2/6/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DuffAndMeat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] meat = new int[N];
        int[] cost = new int[N];
        for (int i = 0; i < N; i++) {
            String[] in = br.readLine().trim().split(" ");
            meat[i] = Integer.parseInt(in[0]);
            cost[i] = Integer.parseInt(in[1]);
        }

        int total = cost[0] * meat[0];
        int min = cost[0];
        int i = 1;
        while (i < N) {
            min = Math.min(cost[i], min);
            total += min * meat[i];
            i++;
        }
        System.out.println(total);
    }
}

