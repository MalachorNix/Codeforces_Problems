import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * http://codeforces.com/problemset/problem/337/A
 */
public class Problem337A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] f = scanner.next().split(" ");
        int n = Integer.parseInt(f[0]);
        int m = Integer.parseInt(f[1]);
        List<Integer> list = Arrays.stream(scanner.next().split(" ")).
                map(Integer::parseInt).
                sorted(Integer::compareTo).
                collect(Collectors.toList());
        scanner.close();
        List<Integer> windows = new ArrayList<>(m);
        for (int i = 0; i + n - 1 < m; i++) {
            windows.add(list.get(i + n - 1) - list.get(i));
        }
        System.out.println(windows.stream().min(Integer::compareTo).get());
    }
}
