import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * http://codeforces.com/problemset/problem/1154/A
 */
public class Problem1154A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        List<Integer> list = Arrays.stream(scanner.next().split(" ")).
                map(Integer::parseInt).
                sorted(Integer::compareTo).
                collect(Collectors.toList());
        scanner.close();
        int aPlusB = list.get(0);
        int aPlusC = list.get(1);
        int bPlusC = list.get(2);
        int aPlusBPlusC = list.get(3);

        int a = aPlusBPlusC - bPlusC;
        int b = aPlusB - a;
        int c = bPlusC - b;

        System.out.println(a + " " + b + " " + c);
    }
}

