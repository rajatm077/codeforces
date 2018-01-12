/**
 * Created by MalhotR1 on 2/1/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AntonAndDanik {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        char[] in = br.readLine().trim().toCharArray();
        int cnt = 0;
        int cnt2 = 0;

        for (int i = 0; i < in.length; i++) {
            if (in[i] == 'A') cnt++;
            else cnt2++;
        }

        if (cnt > cnt2) System.out.println("Anton");
        else if (cnt < cnt2) System.out.println("Danik");
        else System.out.println("Friendship");
    }

}
