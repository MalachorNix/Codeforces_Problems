import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/16/A
 */
public class Problem16A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] f = scanner.next().split(" ");
        int n = Integer.parseInt(f[0]);
        int m = Integer.parseInt(f[1]);
        int flag[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            List<Integer> collect = Arrays.stream(scanner.next().split("")).map(Integer::parseInt).collect(Collectors.toList());
            for (int j = 0; j < m; j++) {
                flag[i][j] = collect.get(j);
            }
        }
        scanner.close();
        boolean result = true;
        if (n == 1 && m == 1) {
        } else if (n == 1) {
            result = checkSimilarityInStrips(flag);
        } else {
            result = checkDifferenceBetweenStrips(flag);
            if (result) {
                result = checkSimilarityInStrips(flag);
            }
        }

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    private static boolean checkDifferenceBetweenStrips(int[][] flag) {
        for (int i = 1; i < flag.length; i++) {
            int prev = flag[i - 1][0];
            int current = flag[i][0];
            if (current == prev) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkSimilarityInStrips(int[][] flag) {
        for (int i = 0; i < flag.length; i++) {
            int start = flag[i][0];
            for (int j = 1; j < flag[0].length; j++) {
                if (flag[i][j] != start) {
                    return false;
                }
            }
        }
        return true;
    }
}
