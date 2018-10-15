import java.util.Scanner;

public class Problem25A {

    public static void main(String[] args) {
        int[] numbers = inputNumbers();

        int lastNumber = numbers[numbers.length - 1];
        int preLastNumber = numbers[numbers.length - 2];

        int result = -1;
        if (lastNumber % 2 != preLastNumber % 2) {
            int prePreLastNumber = numbers[numbers.length - 3];
            if (prePreLastNumber % 2 != lastNumber % 2) {
                result = numbers.length;
            } else {
                result = numbers.length - 1;
            }
        }

        int firstNumber = numbers[0];
        int secondNumber = numbers[1];
        int thirdNumber = numbers[2];

        if (firstNumber % 2 != secondNumber % 2) {
            if (secondNumber % 2 != thirdNumber % 2) {
                result = 2;
            } else {
                result = 1;
            }
        }

        boolean checkOnNextNumber = false;
        if (result == -1) {
            for (int i = 0; i < numbers.length - 2; i++) {
                int current = numbers[i];
                int next = numbers[i + 1];
                if (current % 2 != next % 2) {
                    if (checkOnNextNumber) {
                        result = i + 1;
                        break;
                    }
                    checkOnNextNumber = true;
                }
            }
        }

        System.out.println(result);
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
