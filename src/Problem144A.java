import java.util.Arrays;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/144/A
 */
public class Problem144A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        scanner.next();
        String[] strSoldiersGrowth = scanner.next().split(" ");
        scanner.close();

        int[] soldiersGrowth = new int[strSoldiersGrowth.length];
        for (int i = 0; i < soldiersGrowth.length; i++) {
            soldiersGrowth[i] = Integer.parseInt(strSoldiersGrowth[i]);
        }

        int max = Arrays.stream(soldiersGrowth).max().getAsInt();
        int min = Arrays.stream(soldiersGrowth).min().getAsInt();

        int result = 0;
        int firstIndexOfMax = firstIndexOfMax(max, soldiersGrowth);
        result += firstIndexOfMax;

        int lastIndexOfMin = lastIndexOfMin(min, soldiersGrowth);
        result += soldiersGrowth.length - 1 - lastIndexOfMin;
        if (lastIndexOfMin < firstIndexOfMax) {
            result -= 1;
        }

        System.out.println(result);
    }

    private static int firstIndexOfMax(int max, int[] soldiersGrowth) {
        int result = 0;
        for (int i = 0; i < soldiersGrowth.length; i++) {
            int element = soldiersGrowth[i];
            if (element == max) {
                result = i;
                break;
            }
        }
        return result;
    }

    private static int lastIndexOfMin(int min, int[] soldiersGrowth) {
        int result = 0;
        for (int i = soldiersGrowth.length - 1; i >= 0; i--) {
            int element = soldiersGrowth[i];
            if (element == min) {
                result = i;
                break;
            }
        }
        return result;
    }
}
