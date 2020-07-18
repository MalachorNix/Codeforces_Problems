import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * http://codeforces.com/problemset/problem/580/A
 */
public class Problem580A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        List<Integer> list = Arrays.stream(scanner.next().split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());
        scanner.close();
        int max = 1;
        int currentLength = 1;
        int currentNumber = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (integer >= currentNumber) {
                currentLength++;
                if (currentLength > max) {
                    max = currentLength;
                }
            } else {
                currentLength = 1;
            }
            currentNumber = integer;
        }
        System.out.println(max);
    }
}
