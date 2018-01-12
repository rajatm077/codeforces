/**
 * Created by MalhotR1 on 2/15/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PeakFinding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int peak = findPeak(arr, 0, arr.length - 1);
        System.out.println(peak);
    }

    private static int findPeak(int[] arr, int start, int end) {
        int crr = (start + end) / 2;
        if (crr < arr.length - 1 && arr[crr] < arr[crr + 1]) return findPeak(arr, crr + 1, end);
        else if (crr > 0 && arr[crr] < arr[crr - 1]) return findPeak(arr,start, crr-1);
        else return arr[crr];
    }
}
