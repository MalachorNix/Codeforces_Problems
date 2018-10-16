import java.util.Arrays;
import java.util.Scanner;

public class Problem200B {

    public static void main(String[] args) {
        int[] percentsOfJuice = inputNumbers();
        System.out.println(Double.valueOf(Arrays.stream(percentsOfJuice).reduce(0, (left, right) -> left + right)) / Double.valueOf(percentsOfJuice.length));
    }

    private static int[] inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        String[] strNumbers = scanner.next().split(" ");
        int[] numbers = new int[strNumbers.length];
        for (int i = 0; i < strNumbers.length; i++) {
            String strNumber = strNumbers[i];
            numbers[i] = Integer.parseInt(strNumber);
        }
        scanner.close();
        return numbers;
    }
}
