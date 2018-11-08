import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/732/A
 */
public class Problem732A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] input = scanner.next().split(" ");
        scanner.close();

        int shovelCost = Integer.parseInt(input[0]);
        int coinValue = Integer.parseInt(input[1]);
        int result = 0;

        if (shovelCost == coinValue) {
            result++;
        } else if (shovelCost <= 9 && coinValue % shovelCost == 0) {
            result = coinValue / shovelCost;
        } else if (shovelCost % 10 == 0) {
            result++;
        } else {
            int wasted = 0;
            if (shovelCost < 10) {
                while (wasted < 10) {
                    wasted += shovelCost;
                    result++;
                }
            }
            if (wasted != 10) {
                if (shovelCost > 10) {
                    wasted += shovelCost;
                    result++;
                }
                if ((wasted - (wasted / 10) * 10) == coinValue || wasted % 10 == 0) {
                } else {
                    do {
                        wasted += shovelCost;
                        if ((wasted - (wasted / 10) * 10) == coinValue || wasted % 10 == 0) {
                            result++;
                            break;
                        }
                        result++;
                    } while (true);
                }
            }
        }

        System.out.println(result);
    }
}
