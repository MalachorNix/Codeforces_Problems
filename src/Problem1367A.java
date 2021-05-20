import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1367A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() == 2) {
                System.out.println(s);
            } else {
                StringBuffer result = new StringBuffer();
                char[] chars = s.toCharArray();
                for (int j = 0; j < s.length(); j++) {
                    if (j % 2 == 0 || j == s.length() - 1) {
                        result.append(chars[j]);
                    }
                }
                System.out.println(result);
            }
        }
        br.close();
    }
}
