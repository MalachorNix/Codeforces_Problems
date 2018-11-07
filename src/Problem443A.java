import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://codeforces.com/problemset/problem/443/A
 */
public class Problem443A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        char[] input = scanner.next().toCharArray();
        scanner.close();

        Set<Character> set = new HashSet<>();
        for (char c : input) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }

        System.out.println(set.size());
    }
}
