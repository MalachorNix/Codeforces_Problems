import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Problem431A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var a = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toList();
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.size(); i++) {
            map.put(i + 1, a.get(i));
        }
        var s = Arrays.stream(br.readLine().split("")).map(Integer::parseInt).toList();
        long sum = 0L;
        for (int i = 0; i < s.size(); i++) {
            sum += map.get(s.get(i));
        }
        System.out.println(sum);
        br.close();
    }
}
