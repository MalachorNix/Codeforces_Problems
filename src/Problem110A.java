import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/110/A?locale=en
 */
public class Problem110A {

    public static void main(String[] args) {
        String number = inputNumber();
        long numberOfLuckyDigits = numberOfLuckyDigits(number);
        boolean isAlmostLuckyNumber = isAlmostLuckyNumber(numberOfLuckyDigits);
        printResult(isAlmostLuckyNumber);
    }

    private static void printResult(boolean isAlmostLuckyNumber) {
        if (isAlmostLuckyNumber) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isAlmostLuckyNumber(long numberOfLuckyDigits) {
        String[] strCount = String.valueOf(numberOfLuckyDigits).split("");
        boolean isAlmostLuckyNumber = true;
        for (String digit : strCount) {
            if (!digit.equals("4") && !digit.equals("7")) {
                isAlmostLuckyNumber = false;
                break;
            }
        }
        return isAlmostLuckyNumber;
    }

    private static long numberOfLuckyDigits(String number) {
        String[] digits = number.split("");
        long countOfLuckyDigits = 0;
        for (String digit : digits) {
            if (digit.equals("4") || digit.equals("7")) {
                countOfLuckyDigits++;
            }
        }
        return countOfLuckyDigits;
    }

    private static String inputNumber() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String number = scanner.next();
        scanner.close();
        return number;
    }
}
