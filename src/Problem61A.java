import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/61/A
 */
public class Problem61A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] firstNumber = scanner.next().split("");
        String[] secondNumber = scanner.next().split("");
        scanner.close();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < firstNumber.length; i++) {
            if (firstNumber[i].equals(secondNumber[i])) {
                result.append("0");
            } else {
                result.append("1");
            }
        }

        System.out.println(result);
    }
}
