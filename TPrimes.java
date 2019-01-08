/**
 * Created by MalhotR1 on 01/04/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class TPrimes {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
//            int[] prime = new int[100];
//
//            for (int i = 2; i < prime.length - 1; i++) {
//                if (prime[i] == -1) continue;
//                for (int j = i + 1; j < prime.length; j++) {
//
//                    if (j % i == 0) prime[j] = -1;
//                }
//            }


            String[] in = br.readLine().trim().split(" ");
            for (int i = 0; i < T; i++) {
                long N = Long.parseLong(in[i]);
                if (N < 4) {
                    System.out.println("NO");
                    continue;
                } else if (N == 4) {
                    System.out.println("YES");
                    continue;
                } else if ((N & 1) == 0) {
                    System.out.println("NO");
                    continue;
                } else {
                    long k = (long) Math.sqrt(N);
                    if (k * k == N ) {
                        long l = (long) Math.sqrt(k);
                        int x;
                        for( x=3;x<=l;x+=2){
                            if(k%x==0){
                                System.out.println("NO");
                                break;
                            }
                        }
                        if(x>l)
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
//                        boolean isPrime = true;
//
//                        int temp = (int) Math.sqrt(k);
//                        long[] arr = new long[temp+1];
//
//                        for (int j = 2; j < arr.length-1; j++) {
//                            for (int l = j+1; l < arr.length; l++) {
//                                if (l%j == 0) arr[l] = -1;
//                            }
//                        }
//
//                        for (int j = 2; j < arr.length; j++) {
//                            if (arr[j] != -1 && k % j == 0){
//                                System.out.println("NO");
//                                isPrime = false;
//                                break;
//                            }
//                        }
//                        if (isPrime)
//                        System.out.println("YES");
//                    }else {
//                        System.out.println("NO");
//                    }
////                }
//            }
//        }
//    }
//
//}
