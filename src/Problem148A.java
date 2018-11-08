import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/148/A
 */
public class Problem148A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        int result = 0;

        for (int i = 1; i < d + 1; i++) {
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                result++;
            }
        }

        System.out.println(result);

    }
}
