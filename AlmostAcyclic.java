/**
 * Created by MalhotR1 on 02/06/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class AlmostAcyclic {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] input = br.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[0]);
            int[] in = new int[n+1];
            int[] out = new int[n+1];

            HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

            for (int i = 0; i < m; i++) {
                String[] temp = br.readLine().trim().split(" ");
                int v1 = Integer.parseInt(temp[0]);
                int v2 = Integer.parseInt(temp[1]);
                out[v1]++;
                in[v2]++;
                if (hm.containsKey(v1)) {
                    ArrayList<Integer> al = hm.get(v1);
                    al.add(v2);
                } else {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(v2);
                    hm.put(v1, al);
                }
            }

            boolean flag = false;
            for (int i = 1; i < in.length && !flag; i++) {
                if (in[i] == 1 && hm.containsKey(i)) {
                    ArrayList<Integer> al = hm.get(i);
                    for (Integer v : al) {
                        if (out[v] == 1) {
                            flag = true;
                            break;
                        }
                    }
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");

        }
    }

}
