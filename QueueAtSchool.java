/**
 * Created by malhotr1 on 2/13/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class QueueAtSchool {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        int T = Integer.parseInt(in[1]);
        char[] queue = br.readLine().trim().toCharArray();
        for (int i = 0; i < queue.length - 1; i++) {
            if (queue[i] == 'B') {
                for (int j = i+1; j < queue.length; j++) {

                }
            }
        }
    }
}
