import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/124/A
 */
public class Problem124A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] input = scanner.next().split(" ");
        scanner.close();
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i + 1 > a && n - (i + 1) <= b) {
                count++;
            }
        }
        System.out.println(count);
    }
}
