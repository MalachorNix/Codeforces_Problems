import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1829A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        char[] charArray = "codeforces".toCharArray();
        for (int i = 0; i < t; i++) {
            var s = br.readLine().toCharArray();
            var counter = 0;
            for (int j = 0; j < s.length; j++) {
                if (charArray[j] != s[j]) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
        br.close();
    }

}
