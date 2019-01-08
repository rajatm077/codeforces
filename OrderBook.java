/**
 * Created by MalhotR1 on 05/11/2018.
 */

import javafx.scene.control.TreeCell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static jdk.nashorn.internal.objects.Global.print;

public class OrderBook {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int N = Integer.parseInt(in[0]);
            int s = Integer.parseInt(in[1]);
            HashMap<Integer, Integer> sell = new HashMap<>();
            HashMap<Integer, Integer> buy = new HashMap<>();
            for (int i = 0; i < N; i++) {
                in = br.readLine().trim().split(" ");
                if (in[0].equals("S")) insert(sell, in[1], in[2]);
                else insert(buy, in[1], in[2]);
            }


            ArrayList<Integer> buykeys = new ArrayList<>();
            for (Integer i : buy.keySet()) {
                buykeys.add(i);
            }

            ArrayList<Integer> sellkeys = new ArrayList<>();
            for (Integer i : sell.keySet()) {
                sellkeys.add(i);
            }

            Collections.sort(sellkeys);
            Collections.sort(buykeys, (o1, o2) -> o2 - o1);

            for (int i = Math.min(s-1, sellkeys.size() - 1); i < sellkeys.size() && i >=0 ; i--) {
                int key = sellkeys.get(i);
                int val = sell.get(key);
                System.out.println("S " + key + " " + val);

            }

            for (int i = 0; i < s && i < buykeys.size(); i++) {
                int key = buykeys.get(i);
                int val = buy.get(key);
                System.out.println("B " + key + " " + val);

            }
        }
    }


    private static void insert(HashMap<Integer, Integer> hm,
                               String k, String v) {


        Integer key = Integer.parseInt(k);
        Integer val = Integer.parseInt(v);

        if (hm.containsKey(key)) {
            int current = hm.get(key);
            int updated = current + val;
            hm.replace(key, current, updated);

        } else  {
            hm.put(key, val);
        }
    }

}
