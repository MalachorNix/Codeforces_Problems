import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem34B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var nm = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toUnmodifiableList());
        var n = nm.get(0);
        var m = nm.get(1);
        var prices = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).sorted(Integer::compareTo).collect(Collectors.toUnmodifiableList());
        var result = 0;
        for (int i = 0; i < m && i < n; i++) {
            if (prices.get(i) >= 0) {
                break;
            }
            result += Math.abs(prices.get(i));
        }
        System.out.println(result);
        br.close();
    }

}
