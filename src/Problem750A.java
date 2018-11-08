import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/750/A
 */
public class Problem750A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] input = scanner.next().split(" ");
        scanner.close();

        int numberOfProblems = Integer.parseInt(input[0]);
        int numberOfMinutesFromHomeToParty = Integer.parseInt(input[1]);
        int numberOfMinutesForProblems = 240;
        int wastedMinutes = 0;

        int result = 0;

        for (int i = 0; i < numberOfProblems; i++) {
            wastedMinutes += 5 * (i + 1);
            if (numberOfMinutesForProblems - wastedMinutes >= numberOfMinutesFromHomeToParty) {
                result++;
            } else {
                break;
            }
        }

        System.out.println(result);
    }
}
