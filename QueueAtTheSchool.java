import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MalhotR1 on 12/30/2017.
 */
public class QueueAtTheSchool {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = br.readLine().trim().split(" ");
            int T = Integer.parseInt(in[1]);
            char[] line = br.readLine().toCharArray();
            for (int i = 0; i < line.length-1;) {
                if (line[i] == 'B') {
                    int j = i+1;
//                    if (line[j] == 'B') i = j;
                    if (j == line.length - 1) {
                        swap(line, i , j);
                        break;
                    } else {
                        int cnt = 1;
                        while (cnt < T && j < line.length) {
                            if (line[j] == 'B') break;
                            j++;
                            cnt++;
                        }
                        swap(line, i, j);
                        i = j+1;
                    }
                } else i++;
            }
            for (int i = 0; i < line.length; i++) {
                System.out.print(line[i]);
            }
        }
    }

    private static void swap(char[] line, int i, int j) {
        char temp = line[i];
        line[i] = line[j];
        line[j] = temp;
    }
}
