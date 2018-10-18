import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/581/A?locale=en
 */
public class Problem581A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] numbersOfRedAndBlueSocks = scanner.next().split(" ");
        scanner.close();
        int numberOfRedSocks = Integer.parseInt(numbersOfRedAndBlueSocks[0]);
        int numberOfBlueSocks = Integer.parseInt(numbersOfRedAndBlueSocks[1]);

        int numberOfDaysWithDifferentSocks;
        int numberOfDaysWithSameSocks = 0;

        if (numberOfRedSocks == numberOfBlueSocks) {
            numberOfDaysWithDifferentSocks = numberOfBlueSocks;
        } else {
            numberOfDaysWithDifferentSocks = Math.min(numberOfRedSocks, numberOfBlueSocks);
            if (numberOfRedSocks == numberOfDaysWithDifferentSocks) {
                numberOfBlueSocks -= numberOfRedSocks;
                if (numberOfBlueSocks % 2 == 0) {
                    numberOfDaysWithSameSocks = numberOfBlueSocks / 2;
                } else {
                    numberOfDaysWithSameSocks = (numberOfBlueSocks - 1) / 2;
                }
            } else {
                numberOfRedSocks -= numberOfBlueSocks;
                if (numberOfRedSocks % 2 == 0) {
                    numberOfDaysWithSameSocks = numberOfRedSocks / 2;
                } else {
                    numberOfDaysWithSameSocks = (numberOfRedSocks - 1) / 2;
                }
            }
        }

        System.out.println(numberOfDaysWithDifferentSocks + " " + numberOfDaysWithSameSocks);
    }
}
