import java.util.*;

/**
 * https://codeforces.com/problemset/problem/886/B
 */
public class Problem886B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        String[] s = scanner.next().split(" ");
        scanner.close();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            int index = i;
            map.merge(s[i], index, (integer, integer2) -> index);
        }
        Optional<Map.Entry<String, Integer>> min = map.entrySet().stream().min(Map.Entry.comparingByValue());
        System.out.println(min.get().getKey());
    }


}
