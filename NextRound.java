import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MalhotR1 on 1/30/2017.
 */
public class NextRound {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().trim().split(" ");
        int total = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);

        String[] line2 = br.readLine().trim().split(" ");
        int[] arr = new int[line2.length];
        for (int i = 0; i < line2.length; i++) {
            arr[i] = Integer.parseInt(line2[i]);
        }

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[k-1] && arr[i] > 0) res++;
            else break;
        }
        System.out.println(res);

    }
}
