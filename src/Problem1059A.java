import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1059/A
 */
public class Problem1059A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] f = scanner.next().split(" ");
        int n = Integer.parseInt(f[0]);
        int L = Integer.parseInt(f[1]);
        int a = Integer.parseInt(f[2]);
        int currentTime = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            String[] client = scanner.next().split(" ");
            int t = Integer.parseInt(client[0]);
            int l = Integer.parseInt(client[1]);
            result += (t - currentTime) / a;
            currentTime = t + l;
        }
        scanner.close();
        result += (L - currentTime) / a;
        System.out.println(result);
    }
}
