import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem1999A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            var list = Arrays.stream(br.readLine().split("")).map(Integer::parseInt).collect(Collectors.toList());
            System.out.println(list.get(0) + list.get(1));
        }
        br.close();
    }
}
