import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem1873A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            var symbols = br.readLine();
            if (symbols.equals("abc") || symbols.equals("acb") || symbols.equals("bac") || symbols.equals("cba")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        br.close();
    }
}
