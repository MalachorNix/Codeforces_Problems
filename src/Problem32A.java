import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/32/A
 */
public class Problem32A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] f = scanner.next().split(" ");
        List<Integer> heights = Arrays.stream(scanner.next().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int result = 0;
        int n = Integer.parseInt(f[0]);
        int d = Integer.parseInt(f[1]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && Math.abs(heights.get(i) - heights.get(j)) <= d) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
