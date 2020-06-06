import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1203/A
 */
public class Problem1203A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int q = Integer.parseInt(scanner.next());
        for (int i = 0; i < q; i++) {
            int n = Integer.parseInt(scanner.next());
            String[] students = scanner.next().split(" ");
            if (isRightPossible(n, students) || isBackwardPossible(n, students)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    private static boolean isRightPossible(int n, String[] students) {
        int current = Integer.parseInt(students[0]);
        boolean result = true;
        for (int i = 1; i < n; i++) {
            int next = Integer.parseInt(students[i]);
            if (current == n) {
                current = 0;
            }
            if (next == current + 1) {
                current = next;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }


    private static boolean isBackwardPossible(int n, String[] students) {
        int current = Integer.parseInt(students[0]);
        boolean result = true;
        for (int i = 1; i < n; i++) {
            int next = Integer.parseInt(students[i]);
            if (current == 1) {
                current = n + 1;
            }
            if (next == current - 1) {
                current = next;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
