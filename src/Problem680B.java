import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/680/B
 */
public class Problem680B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] firstInputString = scanner.next().split(" ");
        String[] secondInputString = scanner.next().split(" ");
        int n = Integer.parseInt(firstInputString[0]);
        int a = Integer.parseInt(firstInputString[1]) - 1;
        int[] bandits = new int[n];
        for (int i = 0; i < secondInputString.length; i++) {
            bandits[i] = Integer.parseInt(secondInputString[i]);
        }
        scanner.close();
        int distance = 0;
        int banditsCount = bandits[a];
        boolean isLeftReached = false;
        boolean isRightReached = false;
        while (!isLeftReached || !isRightReached) {
            distance++;
            int leftValue = 0, rightValue = 0;
            if (a - distance < 0) {
                isLeftReached = true;
            }
            if (a + distance >= bandits.length) {
                isRightReached = true;
            }
            if (!isLeftReached) {
                leftValue = bandits[a - distance];
            }
            if (!isRightReached) {
                rightValue = bandits[a + distance];
            }
            if (leftValue == 1 && rightValue == 1) {
                banditsCount++;
                banditsCount++;
            } else if (isLeftReached && rightValue == 1) {
                banditsCount++;
            } else if (leftValue == 1 && isRightReached) {
                banditsCount++;
            }
        }
        System.out.println(banditsCount);
    }
}
