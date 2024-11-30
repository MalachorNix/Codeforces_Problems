import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Problem1520A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            var n = Integer.parseInt(br.readLine());
            var s = br.readLine();
            var currentChar = s.charAt(0);
            var map = new HashMap<Character, Integer>();
            map.put(currentChar, 1);
            char[] string = s.toCharArray();
            boolean result = true;
            for (int j = 1; j < string.length; j++) {
                if (currentChar != string[j]) {
                    if (map.get(string[j]) != null) {
                        result = false;
                        break;
                    } else {
                        currentChar = string[j];
                        map.put(currentChar, 1);
                    }
                }
            }
            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        br.close();
    }

}
