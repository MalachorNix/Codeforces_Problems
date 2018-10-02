import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem479A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        scanner.close();

        List<Integer> expressions = new ArrayList<>();
        expressions.add(a + b * c);
        expressions.add(a * (b + c));
        expressions.add(a * b * c);
        expressions.add((a + b) * c);
        expressions.add(a + b + c);

        System.out.println(Collections.max(expressions));
    }
}
