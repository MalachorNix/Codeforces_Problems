import java.util.*;
import java.util.stream.Collectors;

public class Problem1399A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        for (int i = 0; i < n; i++) {
            scanner.next();
            List<Integer> list = Arrays.stream(scanner.next().split(" ")).
                    map(Integer::parseInt).
                    sorted(Comparator.reverseOrder()).
                    collect(Collectors.toList());
            int size = list.size();
            while (size > 1) {
                int first = list.get(size - 2);
                int second = list.get(size - 1);
                if (Math.abs(second - first) <= 1) {
                    list.remove(size - 1);
                    list = new ArrayList<>(list);
                    size = list.size();
                    continue;
                }
                break;
            }
            System.out.println(size == 1 ? "YES" : "NO");
        }
    }
}
