import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem1760A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            var list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());
            System.out.println(list.get(1));
        }
        br.close();
    }
}
