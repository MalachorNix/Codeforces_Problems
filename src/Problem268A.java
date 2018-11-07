import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/268/A
 */
public class Problem268A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = scanner.nextInt();
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.next().split(" ");
            list.add(new Pair<>(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }
        scanner.close();

        int result = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    Pair<Integer, Integer> teamOne = list.get(i);
                    Pair<Integer, Integer> teamTwo = list.get(j);
                    if (teamOne.getFirst().equals(teamTwo.getSecond())) {
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
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
