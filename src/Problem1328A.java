import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/1328/A
 */
public class Problem1328A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int t = Integer.parseInt(scanner.next());
        int[] results = new int[t];
        for (int i = 0; i < t; i++) {
            String[] f = scanner.next().split(" ");
            int a = Integer.parseInt(f[0]);
            int b = Integer.parseInt(f[1]);
            if (a % b == 0) {
                results[i] = 0;
            } else {
                int destination = (a / b + 1) * b;
                results[i] = destination - a;
            }
        }
        scanner.close();
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
    }
}
