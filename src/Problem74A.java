import java.util.*;

/**
 * https://codeforces.com/problemset/problem/74/A
 */
public class Problem74A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        List<Pair<String, Long>> results = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String[] result = scanner.next().split(" ");
            long points = 100L * Long.parseLong(result[1]) -
                    50 * Long.parseLong(result[2]) +
                    Long.parseLong(result[2]) +
                    Long.parseLong(result[3]) +
                    Long.parseLong(result[4]) +
                    Long.parseLong(result[5]) +
                    Long.parseLong(result[6]) +
                    Long.parseLong(result[7]);
            Pair<String, Long> pair = new Pair<>(result[0], points);
            results.add(pair);
        }
        scanner.close();
        Optional<Pair<String, Long>> max = results.stream().max(Comparator.comparing(Pair::getSecond));
        System.out.println(max.get().getFirst());
    }

    private static class Pair<T, V> {
        private T first;
        private V second;

        Pair(T first, V second) {
            this.first = first;
            this.second = second;
        }

        T getFirst() {
            return first;
        }

        V getSecond() {
            return second;
        }
    }
}
