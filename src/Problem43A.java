import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/43/A
 */
public class Problem43A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        List<String> goals = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            goals.add(scanner.next());
        }
        scanner.close();
        String result = goals.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().stream().
                max(Comparator.comparing(stringLongEntry -> stringLongEntry.getValue())).get().getKey();
        System.out.println(result);
    }
}
