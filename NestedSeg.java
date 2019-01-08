/**
 * Created by MalhotR1 on 05/09/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NestedSeg {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            ArrayList<Interval> al = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                String[] in = br.readLine().trim().split(" ");
                long s = Long.parseLong(in[0]);
                long e = Long.parseLong(in[1]);
                al.add(new Interval(s, e,i + 1));
            }


            Collections.sort(al);

            boolean sol = false;
            for (int i = 0; i < al.size() - 1; i++) {
                int j = i+1;

                for (; j < al.size(); j++) {
                    if (al.get(i).end < al.get(j).start) continue;
                    if (al.get(i).end >= al.get(j).end) {
                        sol = true;
                        break;
                    }
                }
                if (sol) {
                    int i1 = al.get(j).index;
                    int i2 = al.get(i).index;
                    System.out.println(i1 + " " + i2);
                    break;
                }
            }
            if (!sol) System.out.println("-1 -1");
        }
    }



}

class Interval implements Comparable<Interval>{
    long start = 0;
    long end = 0;
    int index = 0;

    Interval(long s, long e, int i) {
        start = s;
        end = e;
        index = i;
    }




    @Override
    public int compareTo(Interval o) {
        return (this.start < o.start) ? -1 :
                ((this.start > o.start) ? 1 :
                    (this.end < o.end ) ? 1 :
                        ((this.end > o.end) ? 1 :
                                (this.index > o.index)? -1 : 0));

    }
}
