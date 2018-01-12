/**
 * Created by MalhotR1 on 2/6/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class keyboard {
    public static void main(String[] args) throws IOException {

        char[] keyboard = ("qwertyuiop" + "asdfghjkl;" + "zxcvbnm,./").toCharArray();

        Map<Character, Integer> lookup = new HashMap<>();
        for (int i = 0; i < keyboard.length; i++) {
            lookup.put(keyboard[i], i);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char direction = br.readLine().trim().charAt(0);
        char[] input = br.readLine().trim().toCharArray();

        int offset = 1;
        if (direction == 'R') offset = -1;
        char[] output = new char[input.length];

        for (int i = 0; i < input.length; i++) {
            int pos = lookup.get(input[i]);
            output[i] = keyboard[pos + offset];
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }

    }
}
