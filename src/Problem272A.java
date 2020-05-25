import java.util.Arrays;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/272/A
 */
public class Problem272A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next()) + 1;
        String[] fingers = scanner.next().split(" ");
        scanner.close();
        int dimasFingers = 1;
        int result = 0;
        while (dimasFingers < 6) {
            int sum = Arrays.stream(fingers).mapToInt(Integer::parseInt).sum() + dimasFingers;
            dimasFingers++;
            if (sum % n != 1) {
                result++;
            }
        }
        System.out.println(result);
    }
}
