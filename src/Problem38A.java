import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/38/A
 */
public class Problem38A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        List<Integer> list = Arrays.stream(scanner.next().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] s = scanner.next().split(" ");
        scanner.close();
        int start = Integer.parseInt(s[0]);
        int finish = Integer.parseInt(s[1]);
        int result = 0;
        for (int i = start - 1; i < finish - 1; i++) {
            result += list.get(i);
        }
        System.out.println(result);
    }
}
