import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Problem1676A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            var a = Arrays.stream(br.readLine().split("")).map(Integer::parseInt).toList();
            if ((a.get(0) + a.get(1) + a.get(2)) == (a.get(3) + a.get(4) + a.get(5))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        br.close();
    }
}
