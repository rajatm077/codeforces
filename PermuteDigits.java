/**
 * Created by MalhotR1 on 01/19/2018.
 * 915C
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PermuteDigits {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            long a = Long.parseLong(br.readLine().trim());
            long b = Long.parseLong(br.readLine().trim());
            if (a == b) {
                System.out.println(a);
                return;
            }

            int loga = logBase10(a);
            int logb = logBase10(b);

            int[] adigits = new int[10];
            while (a > 0) {
                long rem = a % 10;
                adigits[(int) rem]++;
                a = a / 10;
            }
            for (int i = 0; i < adigits.length; i++) {
                if (adigits[i] == 0) adigits[i] = -1;
            }
//            Arrays.sort(adigits);

            long out = 0;
            if (logb > loga) {
                for (int i = adigits.length - 1; i >= 0; i--) {
                    int cnt = adigits[i];
                    for (int j = 0; j < cnt; j++) {
                        out = out * 10 + i;
                    }
                }
                System.out.println(out);

            } else {
                int[] bdigits = new int[loga + 1];
                int[] output = new int[bdigits.length];

                for (int i = 0; i < bdigits.length; i++) {
                    long rem = b % 10;
                    bdigits[i] = (int) rem;
                    b = b / 10;
                }

                for (int ou = 0, i = bdigits.length - 1; i >= 0 && ou < output.length; i--, ou++) {
                    int key = bdigits[i];
                    if (adigits[key] > 0) {
                        output[ou] = key;
                        adigits[key]--;

                    } else {
                        boolean nextMinFound = false;
                        int start = 0;
                        for (int j = key - 1; j >= 0; j--) {
                            if (adigits[j] > 0) {
                                output[ou] = j;
                                adigits[j]--;
                                nextMinFound = true;
                                start = ou + 1;
                                break;
                            }
                        }

                        ou--;
                        while (!nextMinFound && ou > 0) {
                            int key2 = output[ou];
                            for (int j = key2 - 1; j >= 0; j--) {
                                if (adigits[j] > 0) {
                                    output[ou - 1] = j;
                                    adigits[j]--;
                                    adigits[key2]++;
                                    start = ou;
                                    break;
                                }
                            }
                        }

                        for (int k = adigits.length - 1; k >= 0; k--) {
                            int cnt = adigits[k];
                            for (int l = 0; l < cnt && start < output.length; l++, start++) {
                                output[start] = k;
                            }
                        }
                        break;
                    }
                }

                for (int k = 0; k < output.length; k++) {
                    System.out.print(output[k]);
                }
            }
        }
    }

    private static int logBase10(long a) {
        int cnt = 0;
        while (a > 0) {
            a = a / 10;
            cnt++;
        }
        return cnt - 1;
    }
}

