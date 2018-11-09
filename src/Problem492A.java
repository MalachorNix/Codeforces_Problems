import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/492/A
 */
public class Problem492A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int numberOfCubes = scanner.nextInt();
        scanner.close();

        long level = 0;
        int wasted = 0;
        long needToSpend = 1;
        while (needToSpend <= numberOfCubes - wasted) {
            level++;
            wasted += needToSpend;
            needToSpend += level + 1;
        }

        System.out.println(level);

    }
}
