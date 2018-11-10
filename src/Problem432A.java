import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/432/A
 */
public class Problem432A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] nk = scanner.next().split(" ");
        String[] input = scanner.next().split(" ");
        scanner.close();

        int k = Integer.parseInt(nk[1]);

        int count = 0;
        int result = 0;

        for (int i = 0; i < input.length; i++) {
            int numberOfParticipations = Integer.parseInt(input[i]);
            if (5 - numberOfParticipations >= k) {
                count++;
            }
            if (count == 3) {
                count = 0;
                result++;
            }
        }

        System.out.println(result);
    }
}
