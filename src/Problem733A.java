import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/733/A
 */
public class Problem733A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String s = scanner.next();
        scanner.close();
        int max = 0;
        int current = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i <= charArray.length; i++) {
            current++;
            if (i == charArray.length) {
                if (current > max) {
                    max = current;
                }
                current = 0;
                break;
            }
            char c = charArray[i];
            if (isVowel(c)) {
                if (current > max) {
                    max = current;
                }
                current = 0;
            }

        }
        System.out.println(max);
    }

    private static boolean isVowel(Character s) {
        switch (s) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Y':
                return true;
            default:
                return false;
        }
    }
}
