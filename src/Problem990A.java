import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * https://codeforces.com/problemset/problem/990/A
 */
public class Problem990A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] strings = scanner.next().split(" ");
        scanner.close();
        long cabins = Long.parseLong(strings[0]);
        long delegations = Long.parseLong(strings[1]);
        long buildCost = Long.parseLong(strings[2]);
        long destroyCost = Long.parseLong(strings[3]);
        long remainder = cabins % delegations;
        if (remainder == 0) {
            System.out.println("0");
        } else {
            long totalDestroyCost = remainder * destroyCost;
            long toNextCabins = ((cabins / delegations) + 1) * delegations;
            long totalAdditionalBuildCost = (toNextCabins - cabins) * buildCost;
            System.out.println(Stream.of(totalDestroyCost, totalAdditionalBuildCost).min(Long::compareTo).get());
        }
    }
}
