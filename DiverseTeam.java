/**
 * Created by MalhotR1 on 06/01/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class DiverseTeam {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int n = Integer.parseInt(in[0]);
            int k = Integer.parseInt(in[1]);
            in = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            HashSet<Integer> hs = new HashSet<>();
            ArrayList<Integer> indices = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
                if (!hs.contains(arr[i])) {
                    hs.add(arr[i]);
                    indices.add(i+1);
                }
            }

            if (hs.size() < k) System.out.println("NO");
            else {
                System.out.println("YES");
                for (int i = 0; i < k; i++) {
                    System.out.print(indices.get(i) + " ");
                }
                System.out.println();
            }
        }
    }

}
