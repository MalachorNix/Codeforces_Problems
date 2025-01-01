import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem977B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var n = Integer.parseInt(br.readLine());
        var s = br.readLine();
        var pairsCount = new HashMap<String, Integer>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 == chars.length) {
                break;
            }
            var pair = new String(chars, i, 2);
            pairsCount.merge(pair, 1, Integer::sum);
        }
        List<Map.Entry<String, Integer>> sorted = pairsCount.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).toList();
        System.out.println(sorted.get(sorted.size() - 1).getKey());
        br.close();
    }

}
