import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/1335/A
 */
public class Problem1335A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int t = Integer.parseInt(scanner.next());
        int[] results = new int[t];
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.next());
            if (n == 0 || n == 1 || n == 2) {
                results[i] = 0;
            } else if (n % 2 == 0) {
                results[i] = n / 2 - 1;
            } else {
                results[i] = n / 2;
            }
        }
        scanner.close();
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }
}
