import java.util.Arrays;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/136/A?locale=en
 */
public class Problem136A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int numberOfFriends = scanner.nextInt();
        int[] giveTo = new int[numberOfFriends];
        String[] s = scanner.next().split(" ");
        for (int i = 0; i < s.length; i++) {
            giveTo[i] = Integer.parseInt(s[i]);
        }
        scanner.close();

        int[] gotFrom = new int[numberOfFriends];

        for (int i = 0; i < giveTo.length; i++) {
            int giveToFriend = giveTo[i];
            int giveToFriendWithIndex = giveToFriend - 1;
            gotFrom[giveToFriendWithIndex] = i + 1;
        }

        Arrays.stream(gotFrom).forEach(value -> System.out.print(value + " "));
    }
}
