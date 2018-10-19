import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/116/A?locale=en
 */
public class Problem116A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int numberOfStops = scanner.nextInt();

        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < numberOfStops; i++) {
            String[] strPair = scanner.next().split(" ");
            pairs.add(new Pair<>(Integer.parseInt(strPair[0]), Integer.parseInt(strPair[1])));
        }
        scanner.close();

        int maxNumberOfPassengers = 0;
        int count = 0;
        for (Pair<Integer, Integer> pair : pairs) {
            count -= pair.getFirst();
            count += pair.getSecond();
            if (count > maxNumberOfPassengers) {
                maxNumberOfPassengers = count;
            }
        }

        System.out.println(maxNumberOfPassengers);
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
