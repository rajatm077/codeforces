/**
 * Created by MalhotR1 on 06/01/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubstringSort {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int k = Integer.parseInt(br.readLine());
            ArrayList<String> al = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                al.add(br.readLine().trim().toString());
            }
            Collections.sort(al, ((o1, o2) -> o1.length() - o2.length()));

            boolean flag = true;
            for (int i = 0; i < al.size() - 1; i++) {
                String sub = al.get(i);
                for (int j = i+1; j < al.size(); j++) {
                    if (!al.get(j).contains(sub)){
                        flag = false;
                        break;
                    }
                }
                if (!flag) break;
            }
            if (!flag) System.out.println("NO");
            else {
                System.out.println("YES");
                for (String s : al) System.out.println(s);
            }
        }
    }

}
