import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/237/A
 */
public class Problem237A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String time = scanner.next();
            map.merge(time, 1, (integer, integer2) -> integer + 1);
        }
        scanner.close();
        System.out.println(map.entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue())).get().getValue());
    }
}
