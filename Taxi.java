import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MalhotR1 on 12/29/2017.
 */
public class Taxi {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            int[] grps = new int[4];
            int total = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
                grps[arr[i] - 1]++;
            }
            total += grps[3] + grps[2];
            if (grps[0] >= grps[2]) {
                grps[0] = grps[0] - grps[2];
            }
            else {
                grps[0] = 0;
            }
            total += (grps[1]*2 + grps[0] + 3) / 4;
            System.out.println(total);
        }
    }
}
