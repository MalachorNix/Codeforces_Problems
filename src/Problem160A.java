import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * http://codeforces.com/problemset/problem/160/A
 */
public class Problem160A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        List<Integer> list = Arrays.stream(scanner.next().split(" ")).
                map(Integer::parseInt).
                sorted((o1, o2) -> -o1.compareTo(o2)).
                collect(Collectors.toList());
        scanner.close();
        int allSum = list.stream().mapToInt(value -> value).sum();
        int halvedAllSum = allSum / 2;
        int currentSum = 0;
        int coinsNumber = 0;
        for (int i = 0; i < n; i++) {
            Integer coin = list.get(i);
            if (currentSum + coin > halvedAllSum) {
                coinsNumber++;
                currentSum += coin;
                break;
            } else {
                coinsNumber++;
                currentSum += coin;
            }
        }
        System.out.println(coinsNumber);
    }
}
