import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/628/A
 */
public class Problem628A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] input = scanner.next().split(" ");
        scanner.close();
        int n = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int p = Integer.parseInt(input[2]);
        int x = 0;
        int y = p * n;
        while (n != 1) {
            int k = getK(n);
            int matches = k / 2;
            x += k * b + matches;
            n = k / 2 + n - k;
        }
        System.out.println(x + " " + y);
    }

    private static int getK(int n) {
        double k = 1;
        int count = 1;
        while (k < n) {
            k = Math.pow(2, count);
            count++;
        }
        if (k > n) {
            k = Math.pow(2, count - 2);
        }
        return (int) k;
    }
}
