import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/368/A
 */
public class Problem368A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] firstString = scanner.next().split(" ");
        String[] secondString = scanner.next().split(" ");
        int m = Integer.parseInt(scanner.next());
        int d = Integer.parseInt(firstString[1]);
        List<Integer> costs = Arrays.stream(secondString).map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        int result = 0;
        for (int i = 0; i < m; i++) {
            Optional<Integer> min = costs.parallelStream().min(Integer::compareTo);
            if (min.isPresent()) {
                costs.remove(min.get());
                result += min.get();
            } else {
                result -= d;
            }
        }

        System.out.println(result);
    }
}
