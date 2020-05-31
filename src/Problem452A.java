import java.util.List;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/452/A
 */
public class Problem452A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        scanner.next();
        String mask = scanner.next();
        scanner.close();
        List<String> list = List.of("vaporeon", "jolteon", "flareon", "espeon", "umbreon", "leafeon", "glaceon", "sylveon");
        String result = "";
        for (String s : list) {
            if (s.matches(mask)) {
                result = s;
                break;
            }
        }
        System.out.println(result);
    }
}
