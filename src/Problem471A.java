import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://codeforces.com/problemset/problem/471/A
 */
public class Problem471A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] branches = scanner.next().split(" ");
        scanner.close();
        Set<Map.Entry<String, Long>> entries = Stream.of(branches).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet();
        Long possibleLegsNumber = entries.stream().max(Comparator.comparing(stringLongEntry -> stringLongEntry.getValue())).get().getValue();
        if (possibleLegsNumber < 4) {
            System.out.println("Alien");
        } else if (entries.size() == 1) {
            System.out.println("Elephant");
        } else if (entries.size() == 3) {
            System.out.println("Bear");
        } else if (possibleLegsNumber == 5) {
            System.out.println("Bear");
        } else {
            System.out.println("Elephant");
        }
    }
}
