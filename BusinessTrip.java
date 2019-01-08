import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by MalhotR1 on 01/01/2018.
 */
public class BusinessTrip {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int k = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().split(" ");

            if (k == 0) {
                System.out.println(k);
                return;
            }


            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            Arrays.sort(arr);
            int count = 0;
            int sum = 0;
            for (int i = arr.length - 1; i >=0 ; i--) {
                count++;
                sum += arr[i];
                if (sum >= k) break;
            }
            if (sum >= k) System.out.println(count);
            else System.out.println(-1);
        }
    }
}
