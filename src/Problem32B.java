import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/32/B
 */
public class Problem32B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String number = scanner.next();
        scanner.close();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < number.length(); ) {
            if (i + 2 <= number.length()) {
                String substring = number.substring(i, i + 2);
                switch (substring) {
                    case "-.": {
                        result.append("1");
                        i += 2;
                        break;
                    }
                    case "--": {
                        result.append("2");
                        i += 2;
                        break;
                    }
                    case "..": {
                        result.append("00");
                        i += 2;
                        break;
                    }
                    default: {
                        result.append("0");
                        i += 1;
                        break;
                    }
                }
            } else if (i + 1 <= number.length()) {
                result.append("0");
                i += 1;
            } else {
                break;
            }
        }

        System.out.println(result.toString());
    }
}
