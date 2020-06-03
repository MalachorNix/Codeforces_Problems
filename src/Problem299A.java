import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://codeforces.com/problemset/problem/299/A
 */
public class Problem299A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        String[] s = scanner.next().split(" ");
        Set<Integer> set = new TreeSet<>(Integer::compareTo);
        for (String s1 : s) {
            set.add(Integer.parseInt(s1));
        }
        scanner.close();
        Integer first = set.iterator().next();
        int result = first;
        for (Integer integer : set) {
            if (integer % first != 0) {
                result = -1;
                break;
            }
            if (result == -1) {
                break;
            }
        }
        System.out.println(result);
    }
}
