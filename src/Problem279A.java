import java.util.Scanner;

public class Problem279A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        Integer year = Integer.parseInt(scanner.next());
        scanner.close();
        year++;
        while (containsDuplicateDigit(year)) {
            year++;
        }

        System.out.println(year);
    }

    private static boolean containsDuplicateDigit(Integer year) {
        boolean result = false;

        String[] digits = year.toString().split("");
        for (String digit : digits) {
            int count = 0;
            for (String s : digits) {
                if (digit.equals(s)) {
                    count++;
                }
            }
            if (count > 1) {
                result = true;
                break;
            }

        }

        return result;
    }
}
