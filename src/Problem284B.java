import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/284/B
 */
public class Problem284B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        scanner.next();
        Map<String, Long> collect = Arrays.stream(scanner.next().split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        scanner.close();

        Long i = collect.get("I");
        if (i != null) {
            if (i == 1) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            Long a = collect.get("A");
            if (a != null) {
                System.out.println(a);
            } else {
                System.out.println("0");
            }
        }
    }
}
