import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/757/A
 */
public class Problem757A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] input = scanner.next().split("");
        scanner.close();
        int count = 0;

        Map<String, Long> collect = Arrays.stream(input).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Long B = collect.get("B");
        Long u = collect.get("u");
        Long l = collect.get("l");
        Long b = collect.get("b");
        Long a = collect.get("a");
        Long s = collect.get("s");
        Long r = collect.get("r");


        if (B != null && u != null && l != null && b != null && a != null && s != null && r != null) {
            while (B > 0 && u > 1 && l > 0 && b > 0 && a > 1 && s > 0 && r > 0) {
                B -= 1;
                u -= 2;
                l -= 1;
                b -= 1;
                a -= 2;
                s -= 1;
                r -= 1;
                count++;
            }
        }

        System.out.println(count);
    }
}
