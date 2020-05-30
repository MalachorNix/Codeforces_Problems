import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/441/A
 */
public class Problem441A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] firstString = scanner.next().split(" ");
        int n = Integer.parseInt(firstString[0]);
        int v = Integer.parseInt(firstString[1]);
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.next().split(" ");
            for (int j = 1; j < input.length; j++) {
                if (v > Integer.parseInt(input[j])) {
                    set.add(i + 1);
                    break;
                }
            }
        }
        scanner.close();
        System.out.println(set.size());
        System.out.println(set.stream().map(integer -> integer + "").collect(Collectors.joining(" ")));
    }
}
