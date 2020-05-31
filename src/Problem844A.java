import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/844/A
 */
public class Problem844A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String word = scanner.next();
        int k = Integer.parseInt(scanner.next());
        scanner.close();
        if (word.length() < k) {
            System.out.println("impossible");
        } else {
            Map<String, Long> map = Arrays.stream(word.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            if (map.size() >= k) {
                System.out.println(0);
            }  else {
                System.out.println(k - map.size());
            }
        }

    }
}
