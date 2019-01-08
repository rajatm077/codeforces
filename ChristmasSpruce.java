/**
 * Created by MalhotR1 on 01/09/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChristmasSpruce {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int N = Integer.parseInt(br.readLine().trim());

            if (N < 4) {
                System.out.println("No");
                return;
            }
            int[] parent = new int[N + 1];
            int[] children = new int[N + 1];
            int[] leaf = new int[N + 1];

            parent[0] = -1;
            parent[1] = 1;
            children[0] = -1;

            for (int i = 2; i <= N; i++) {
                int v = Integer.parseInt(br.readLine().trim());
                children[v]++;
                leaf[v]++;
                parent[i] = v;
            }

            for (int i = 2; i < children.length; i++) {
                if (children[i] > 0) {
                    leaf[parent[i]]--;
                }
            }

            for (int i = 1; i < leaf.length; i++) {
                if (children[i] > 0 && leaf[i] < 3) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");

        }

    }
}
