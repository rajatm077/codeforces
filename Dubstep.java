/**
 * Created by MalhotR1 on 2/15/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Dubstep {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split("WUB");
        for (int i = 0; i < in.length; i++) {
            if (!in[i].isEmpty())
            System.out.print(in[i] + " ");
        }
    }
}
