import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/584/A?locale=en
 */
public class Problem584A {

    public static void main(String[] args) {
        String input = input();
        Pair<Integer, Integer> pair = parse(input);
        Integer lengthOfNumber = pair.getFirst();
        Integer divider = pair.getSecond();
        BigInteger result = solve(lengthOfNumber, divider);
        print(result);
    }

    private static BigInteger solve(Integer lengthOfNumber, long divider) {
        BigInteger from =  BigInteger.TEN.pow(lengthOfNumber - 1);
        BigInteger till =  BigInteger.TEN.pow(lengthOfNumber).subtract(BigInteger.ONE);
        BigInteger result = BigInteger.ZERO.subtract(BigInteger.ONE);
        if (BigInteger.valueOf(divider).compareTo(till) < 1) {
            BigInteger current = from;
            while (current.remainder(BigInteger.valueOf(divider)).compareTo(BigInteger.ZERO) != 0) {
                current = current.add(BigInteger.ONE);
            }
            result = current;
        }
        return result;
    }

    private static void print(BigInteger result) {
        System.out.println(result);
    }

    private static Pair<Integer, Integer> parse(String string) {
        String[] strPair = string.split(" ");
        return new Pair<>(Integer.valueOf(strPair[0]), Integer.valueOf(strPair[1]));
    }

    private static String input() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String input = scanner.next();
        scanner.close();
        return input;
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
