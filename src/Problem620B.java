import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/620/B
 */
public class Problem620B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] input = scanner.next().split(" ");
        scanner.close();
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        long result = 0L;
        for (int i = a; i <= b; i++) {
            for (String digit : (i + "").split("")) {
                result += getNumbers(digit);
            }
        }
        System.out.println(result);
    }

    private static long getNumbers(String number) {
        switch (number) {
            case "0":
            case "6":
            case "9":
                return 6;
            case "1":
                return 2;
            case "2":
            case "3":
            case "5":
                return 5;
            case "4":
                return 4;
            case "7":
                return 3;
            case "8":
                return 7;
            default:
                return 0;
        }
    }
}
