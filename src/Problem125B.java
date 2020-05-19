import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/125/B
 */
public class Problem125B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] input = scanner.next().split("(?=<)|(?<=>)");
        scanner.close();
        int indentCount = 0;
        for (String tag : input) {
            StringBuilder indent = new StringBuilder("");
            for (int i = 0; i < 2 * indentCount; i++) {
                indent.append(" ");
            }
            if (!tag.startsWith("</")) {
                indentCount++;
            } else {
                indent = new StringBuilder(indent.substring(0, indent.length() - 2));
                indentCount--;
            }
            indent.append(tag);
            System.out.println(indent.toString());
        }
    }
}
