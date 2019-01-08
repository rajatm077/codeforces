/**
 * Created by MalhotR1 on 01/04/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class XeniaWeights {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split("");
            if (in.length == 1) {
                System.out.println("NO");
                return;
            }

            int M = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[in.length];
            int[] W = new int[in.length];
            int[] scale = new int[2];
            int cnt = 0;
            for (int i = 0, k = 0; i < in.length && k < W.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
                if (arr[i] != 0) {
                    W[k++] = i+1;
                    cnt++;
                }
            }
            Arrays.sort(W);
            int prev = 0;
            boolean possible = true;
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < M && possible; i++) {
                if (i == 0) {
                    scale[i%2] = W[0];
                    prev = W[0];
                    al.add(prev);
                }
                possible = false;
                for (int j = 0; j < cnt; j++) {
                    if (W[j] !=  prev+1) {
                        scale[i%2] += W[j];
                        if (scale[i%2] > scale[(i-1)%2]) {
                            prev = W[j];
                            possible = true;
                            al.add(prev);
                            break;
                        }
                    }
                }

            }
            if (possible) {
                System.out.println("YES");
                for (int i = 0; i < al.size(); i++) {
                    System.out.print(al.get(i) + " ");
                }
            }
        }
    }

}
