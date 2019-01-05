import java.util.Scanner;

public class Problem472A {

    public static void main(String[] args) {
        int number = inputNumber();
        int firstHalf = number / 2;
        int secondHalf = number - firstHalf;
        while (isPrimeNumber(firstHalf) || isPrimeNumber(secondHalf)) {
            firstHalf--;
            secondHalf = number - firstHalf;
        }
        System.out.println(firstHalf + " " + secondHalf);
    }

    private static boolean isPrimeNumber(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    private static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }
}
