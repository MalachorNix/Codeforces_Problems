import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/791/A
 */
public class Problem791A {

    public static void main(String[] args) {
        int[] ints = inputPairOfInt();
        int limakWeight = ints[0];
        int bobWeight = ints[1];

        int count = 0;

        while (limakWeight <= bobWeight) {
            limakWeight *= 3;
            bobWeight *= 2;
            count++;
        }

        System.out.println(count);
    }

    private static int[] inputPairOfInt() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] pair = scanner.next().split(" ");
        scanner.close();
        int[] result = new int[pair.length];
        result[0] = Integer.parseInt(pair[0]);
        result[1] = Integer.parseInt(pair[1]);
        return result;
    }
}
