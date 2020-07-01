import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/22/A
 */
public class Problem22A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        scanner.next();
        String[] f = scanner.next().split(" ");
        Optional<Integer> any = Arrays.stream(f).map(Integer::parseInt).sorted().distinct().skip(1).findAny();
        if (any.isPresent()) {
            System.out.println(any.get());
        } else {
            System.out.println("NO");
        }
    }
}
