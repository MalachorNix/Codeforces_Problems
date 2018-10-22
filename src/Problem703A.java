import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/703/A?locale=en
 */
public class Problem703A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int numberOfRounds = scanner.nextInt();
        int countOfMishkasWins = 0;
        int countOfChrisWins = 0;
        for (int i = 0; i < numberOfRounds; i++) {
            String[] pairs = scanner.next().split(" ");
            int mishkaPoint = Integer.parseInt(pairs[0]);
            int chrisPoint = Integer.parseInt(pairs[1]);
            if (mishkaPoint > chrisPoint) {
                countOfMishkasWins++;
            } else if (chrisPoint > mishkaPoint) {
                countOfChrisWins++;
            }
        }
        scanner.close();

        if (countOfMishkasWins > countOfChrisWins) {
            System.out.println("Mishka");
        } else if (countOfChrisWins > countOfMishkasWins) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
