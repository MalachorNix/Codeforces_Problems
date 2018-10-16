import java.util.Scanner;

public class Problem520A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String n = scanner.next();
        String string = scanner.next();
        scanner.close();

        System.out.println(isPangram(string) ? "YES" : "NO");
    }

    private static boolean isPangram(String string) {
        String lowerCaseString = string.toLowerCase();
        for (char i = 'a'; i <= 'z'; i++) {
            String letter = String.valueOf(i);
            if (!lowerCaseString.contains(letter)) {
                return false;
            }
        }
        return true;
    }
}
