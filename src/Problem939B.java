import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/939/B
 */
public class Problem939B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] f = scanner.next().split(" ");
        String[] s = scanner.next().split(" ");
        scanner.close();
        long n = Long.parseLong(f[0]);
        long k = Long.parseLong(f[1]);
        long minimumIndex = 0;
        long minimumRemainder = Long.MAX_VALUE;
        long capacity = Long.MAX_VALUE;
        long quantity = Long.MAX_VALUE;
        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
            long a = Long.parseLong(s1);
            long remainder = n % a;
            if (remainder == 0) {
                System.out.println((i + 1) + " " + (n / a));
                return;
            } else if (remainder < minimumRemainder) {
                minimumIndex = i;
                minimumRemainder = remainder;
                capacity = a;
                quantity = n / capacity;
            }
        }
        System.out.println((minimumIndex + 1) + " " + quantity);
    }

}
