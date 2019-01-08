import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by MalhotR1 on 01/01/2018.
 */
public class Quiz {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            String[] quiz = br.readLine().trim().split(" ");
            int[] arr = new int[quiz.length];
            for (int i = 0; i < quiz.length; i++) {
                arr[i] = Integer.parseInt(quiz[i]);
            }
            Arrays.sort(arr);
            int n = Integer.parseInt(in[0]);
            int min_diff = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length - n + 1; i++) {
                int diff = arr[i+n-1] - arr[i];
                if (diff < min_diff) min_diff = diff;
            }
            System.out.println(min_diff);
        }
    }
}
