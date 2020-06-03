import java.util.*;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/507/A
 */
public class Problem507A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] f = scanner.next().split(" ");
        String[] s = scanner.next().split(" ");
        scanner.close();
        int n = Integer.parseInt(f[0]);
        int k = Integer.parseInt(f[1]);
        List<Pair<Integer, Integer>> list = new ArrayList<>(n);
        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
            list.add(new Pair<>(i, Integer.parseInt(s1)));
        }
        list.sort(Comparator.comparing(Pair::getSecond));
        int spent = 0;
        List<Integer> originIndexes = new LinkedList<>();
        for (Pair<Integer, Integer> pair : list) {
            if (spent + pair.getSecond() <= k) {
                spent += pair.getSecond();
                originIndexes.add(pair.getFirst() + 1);
            }
        }
        System.out.println(originIndexes.size());
        if (spent > 0) {
            System.out.println(originIndexes.stream().map(Object::toString).collect(Collectors.joining(" ")));
        }
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
