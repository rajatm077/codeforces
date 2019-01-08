/**
 * Created by MalhotR1 on 12/15/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int k = Integer.parseInt(br.readLine().trim());

            TreeMap<Long, Long> tm = new TreeMap<>();
            long total = 0;
            for (int i = 0; i < in.length; i++) {
                long key = Long.parseLong(in[i]);
                total += key;
                if (tm.containsKey(key)) tm.replace(key, tm.get(key), tm.get(key) + 1);
                else tm.put(key, 1l);
            }

            ArrayList<Long> al = new ArrayList<>();
            for (long l : tm.keySet()) {
                al.add(l);
            }

            for (int i = 0; i < k; i++) {
                long coin = Long.parseLong(br.readLine().trim());
                if (coin < al.get(0)) System.out.println(0);
                else if (coin > al.get(al.size() - 1)) System.out.println(total);
                else {
                    int index = Collections.binarySearch(al, coin);


                    if (index < 0) {
                        index = -index;
                        index = index - 2;
                    }

                    total = 0;
                    for (int j = 0; j <= index; j++) {
                        long key = al.get(j);
                        total += tm.get(key);
                    }

                    System.out.println(total);
                }
            }
        }
    }
}
