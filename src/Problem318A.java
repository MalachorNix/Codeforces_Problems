import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/318/A?locale=en
 */
public class Problem318A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] pair = scanner.next().split(" ");
        scanner.close();

        long n = Long.valueOf(pair[0]);
        long position = Long.valueOf(pair[1]);

        long number;

        long borderIndex = n / 2;
        if (n % 2 == 1) {
            borderIndex++;
        }
        if (borderIndex >= position) {
            number = 2 * position - 1;
        } else {
            number = 2 * (position - borderIndex);
        }
        System.out.println(number);
    }

}
