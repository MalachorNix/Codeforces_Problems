import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/313/A
 */
public class Problem313A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String input = scanner.next();
        scanner.close();

        long account = Long.parseLong(input);
        if (account >= 0) {
            System.out.println(account);
        } else {
            long withoutLastDigit = Long.parseLong(input.substring(0, input.length() - 1));
            String tillPreLastDigit = input.substring(0, input.length() - 2);
            String lastDigit = input.substring(input.length() - 1);
            long withoutPreLastDigit = Long.parseLong(tillPreLastDigit + lastDigit);
            long max = Math.max(withoutLastDigit, withoutPreLastDigit);
            System.out.println(max);
        }

    }

}
