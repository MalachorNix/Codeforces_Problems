import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1234/B1
 */
public class Problem1234B1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] firstInputString = scanner.next().split(" ");
        String[] secondInputString = scanner.next().split(" ");
        int n = Integer.parseInt(firstInputString[0]);
        int k = Integer.parseInt(firstInputString[1]);
        scanner.close();
        Deque<String> dialogs = new ArrayDeque<>(k);
        for (String friendId : secondInputString) {
            if (!dialogs.contains(friendId)) {
                dialogs.remove(friendId);
                dialogs.push(friendId);
                if (dialogs.size() > k) {
                    dialogs.pollLast();
                }
            }
        }
        System.out.println(dialogs.size());
        System.out.println(String.join(" ", dialogs));
    }
}
