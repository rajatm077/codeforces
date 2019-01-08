/**
 * Created by MalhotR1 on 01/03/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Teamolympiad {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[N];
            int[] skill = new int[3];
            ArrayList<ArrayList<Integer>> index = new ArrayList<>();
            index.add(new ArrayList<>());
            index.add(new ArrayList<>());
            index.add(new ArrayList<>());

            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(in[i]);
                skill[arr[i]-1]++;
                index.get(arr[i]-1).add(i+1);
            }
            int min = Math.min(skill[0], Math.min(skill[1], skill[2]));
            if (min == 0) {
                System.out.println(0);
                return;
            }
            System.out.println(min);
            for (int i = 0; i < min; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(index.get(j).get(i) + " ");
                }
                System.out.println();
            }

        }
    }

}
