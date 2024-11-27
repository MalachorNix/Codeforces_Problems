import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem1619A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            var word = br.readLine();
            if (word.length() % 2 != 0) {
                System.out.println("NO");
            } else if (word.substring(0, word.length() / 2).equals(word.substring(word.length() / 2))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        br.close();
    }

}
