import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1230/B
 */
public class Problem1230B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] f = scanner.next().split(" ");
        String[] number = scanner.next().split("");
        scanner.close();
        int k = Integer.parseInt(f[1]);
        String firstDigit = number[0];
        StringBuilder result = new StringBuilder();
        if (number.length == 1) {
            if (k > 0) {
                System.out.println(0);
            } else {
                System.out.println(firstDigit);
            }
        } else {
            if (!firstDigit.equals("1") && k > 0) {
                result.append("1");
                k--;
            } else {
                result.append(firstDigit);
            }
            for (int i = 1; i < number.length; i++) {
                String digit = number[i];
                if (!digit.equals("0") && k > 0) {
                    result.append("0");
                    k--;
                } else {
                    result.append(digit);
                }
            }
            System.out.println(result.toString());
        }
    }
}
