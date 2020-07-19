import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/996/A
 */
public class Problem996A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        scanner.close();
        int quantity = 0;
        int[] coins = {100, 20, 10, 5, 1};
        for (int i = 0; i < coins.length; i++) {
            int d = n / coins[i];
            quantity += d;
            n -= coins[i] * d;
        }
        System.out.println(quantity);
    }
}
