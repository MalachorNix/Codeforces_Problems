import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem266A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i + 1] == chars[i]) {
                result++;
            }
        }

        System.out.println(result);
    }
}
