import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/677/A
 */
public class Problem677A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] firstString = scanner.next().split(" ");
        String[] secondString = scanner.next().split(" ");
        scanner.close();

        int height = Integer.parseInt(firstString[1]);
        int[] friendsGrowth = new int[secondString.length];
        for (int i = 0; i < friendsGrowth.length; i++) {
            friendsGrowth[i] = Integer.parseInt(secondString[i]);
        }

        int result = 0;

        for (int i : friendsGrowth) {
            if (i > height) {
                result += 2;
            } else {
                result++;
            }
        }

        System.out.println(result);
    }


}
