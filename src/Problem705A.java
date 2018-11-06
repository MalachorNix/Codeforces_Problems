import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/705/A
 */
public class Problem705A {

    public static void main(String[] args) {
        int levels = inputNumber();
        StringBuilder result = construct(levels);
        print(result);
    }

    private static StringBuilder construct(int levels) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < levels; i++) {
            if (i % 2 == 0) {
                result.append("I hate ");
            } else {
                result.append("I love ");
            }
            if (i + 1 == levels) {
                result.append("it");
            } else {
                result.append("that");
            }
            result.append(" ");
        }
        return result;
    }

    private static void print(StringBuilder result) {
        System.out.println(result.toString().trim());
    }

    private static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }
}
