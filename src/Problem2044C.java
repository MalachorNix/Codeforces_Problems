import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem2044C {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            var mabc = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toUnmodifiableList());
            var m = mabc.get(0);
            var a = mabc.get(1);
            var b = mabc.get(2);
            var c = mabc.get(3);
            var spareFirst = m;
            var spareSecond = m;
            var max = 2 * m;
            var count = 0;
            count += Math.min(a, spareFirst);
            count += Math.min(b, spareSecond);
            spareFirst -= Math.min(a, spareFirst);
            spareSecond -= Math.min(b, spareSecond);
            var totalSpare = spareFirst + spareSecond;
            count += Math.min(c, totalSpare);
            System.out.println(count);
        }
        br.close();
    }

}
