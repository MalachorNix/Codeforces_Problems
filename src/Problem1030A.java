import java.util.Arrays;
import java.util.Scanner;

public class Problem1030A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        scanner.next();
        String[] input = scanner.next().split(" ");
        scanner.close();

        long reduce = Arrays.stream(input).mapToLong(Long::valueOf).reduce(0, (left, right) -> left + right);
        if (reduce > 0) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}
