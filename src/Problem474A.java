import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/474/A?locale=en
 */
public class Problem474A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String shift = scanner.next();
        String string = scanner.next();
        scanner.close();

        String firstLine = "qwertyuiop";
        String secondLine = "asdfghjkl;";
        String thirdLine = "zxcvbnm,./";

        StringBuilder result = new StringBuilder();
        if (shift.equals("R")) {
            for (String letter : string.split("")) {
                if (firstLine.contains(letter)) {
                    shiftRight(firstLine, result, letter);
                } else if (secondLine.contains(letter)) {
                    shiftRight(secondLine, result, letter);
                } else {
                    shiftRight(thirdLine, result, letter);
                }
            }
        } else {
            for (String letter : string.split("")) {
                if (firstLine.contains(letter)) {
                    shiftLeft(firstLine, result, letter);
                } else if (secondLine.contains(letter)) {
                    shiftLeft(secondLine, result, letter);
                } else {
                    shiftLeft(thirdLine, result, letter);
                }
            }
        }

        System.out.println(result.toString());
    }

    private static void shiftLeft(String line, StringBuilder result, String letter) {
        int i = line.indexOf(letter);
        if (i == line.length() - 1) {
            result.append(letter);
        } else {
            result.append(line.charAt(i + 1));
        }
    }

    private static void shiftRight(String line, StringBuilder result, String letter) {
        int i = line.indexOf(letter);
        if (i == 0) {
            result.append(letter);
        } else {
            result.append(line.charAt(i - 1));
        }
    }
}

