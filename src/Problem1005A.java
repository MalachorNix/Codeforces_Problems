import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem1005A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        scanner.next();
        String input = scanner.next();
        scanner.close();

        String[] s = input.split(" ");
        int[] sequence = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            sequence[i] = Integer.parseInt(s[i]);
        }

        int count = 0;
        for (int i : sequence) {
            if (i == 1) {
                count++;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] == 1) {
                res.add(sequence[i - 1]);
            }
            if (i + 1 == sequence.length && sequence[i] != 1) {
                res.add(sequence[i]);
            }
            if (i + 1 == sequence.length && sequence[i] == 1) {
                res.add(1);
            }
        }

        if (res.size() == 0) {
            res.add(1);
        }

        System.out.println(count);
        System.out.println(res.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
