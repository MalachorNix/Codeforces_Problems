import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/34/A
 */
public class Problem34A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int number = Integer.parseInt(scanner.next());
        List<Integer> list = Arrays.stream(scanner.next().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        int minLeftIndex = list.size() - 1;
        int minRightIndex = 0;
        int min = Math.abs(list.get(minLeftIndex) - list.get(minRightIndex));
        for (int i = 0; i < list.size() - 1; i++) {
            int diff = Math.abs(list.get(i) - list.get(i + 1));
            if (min > diff) {
                min = diff;
                minLeftIndex = i;
                minRightIndex = i + 1;
            }
        }
        System.out.println((minLeftIndex + 1) + " " + (minRightIndex + 1));
    }
}
