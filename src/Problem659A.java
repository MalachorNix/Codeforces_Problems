import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/659/A
 */
public class Problem659A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] s = scanner.next().split(" ");
        scanner.close();
        int n = Integer.parseInt(s[0]);
        int a = Integer.parseInt(s[1]);
        int b = Integer.parseInt(s[2]);
        int currentIndex = a - 1;
        for (int i = 0; i < Math.abs(b); i++) {
            if (b > 0) {
                currentIndex++;
            } else {
                currentIndex--;
            }
            if (currentIndex == -1) {
                currentIndex = n - 1;
            } else if (currentIndex == n) {
                currentIndex = 0;
            }
        }
        System.out.println(currentIndex + 1);
    }
}
