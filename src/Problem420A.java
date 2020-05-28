import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/420/A
 */
public class Problem420A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String input = scanner.next();
        scanner.close();
        if (containsOnlySymmetricSymbols(input) && new StringBuilder(input).reverse().toString().equals(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean containsOnlySymmetricSymbols(String input) {
        List<String> symmetricSymbols = Arrays.asList("AHIMOTUVWXY".split(""));
        return !Arrays.stream(input.split("")).anyMatch(s -> !symmetricSymbols.contains(s));
    }
}