import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/155/A
 */
public class Problem155A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = scanner.nextInt();
        String[] input = scanner.next().split(" ");
        scanner.close();

        int result = 0;
        int max = Integer.parseInt(input[0]);
        int min = Integer.parseInt(input[0]);

        for (int i = 1; i < input.length; i++) {
            int score = Integer.parseInt(input[i]);
            if (score > max) {
                max = score;
                result++;
            } else if (score < min) {
                min = score;
                result++;
            }
        }

        System.out.println(result);
    }
}
