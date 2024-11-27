import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem1985A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            var words = br.readLine().split(" ");
            System.out.println(words[1].charAt(0) + words[0].substring(1) + " " + words[0].charAt(0) + words[1].substring(1));
        }
        br.close();
    }

}
