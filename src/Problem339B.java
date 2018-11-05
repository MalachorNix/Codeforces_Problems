import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/339/B
 */
public class Problem339B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] firstString = scanner.next().split(" ");
        String[] secondString = scanner.next().split(" ");
        scanner.close();

        int n = Integer.parseInt(firstString[0]);

        long result = 0;

        int current = 1;

        for (String strIndex : secondString) {
            int index = Integer.parseInt(strIndex);
            if (index != current) {
                if (index > current) {
                    result += index - current;
                } else {
                    result += index + (n - current);
                }
                current = index;
            }
        }

        System.out.println(result);
    }
}
