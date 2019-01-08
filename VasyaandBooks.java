import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class VasyaandBooks {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in1 = br.readLine().trim().split(" ");
            int[] stack = new int[in1.length];
            for (int i = 0; i < in1.length; i++) {
                stack[i] = Integer.parseInt(in1[i]);
            }

            String[] in2 = br.readLine().trim().split(" ");
            int[] order = new int[in2.length];
            for (int i = 0; i < in2.length; i++) {
                order[i] = Integer.parseInt(in2[i]);
            }

            int crr = 0;
            int[] arr = new int[order.length];
            for (int i = 0; i < order.length; i++) {
                if (arr[order[i] - 1] == 1) {
                    System.out.print("0 ");
                    continue;
                }

                for (int j = crr; j < stack.length; j++) {
                    if (order[i] != stack[j]) {
                        arr[stack[j] - 1] = 1;

                    } else {
                        int out = j - crr + 1;
                        crr = j + 1;
                        System.out.print(out + " ");
                        break;
                    }
                }
            }
        }
    }
}

