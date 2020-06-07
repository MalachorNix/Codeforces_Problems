import java.util.*;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/1073/B
 */
public class Problem1073B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        String[] input = scanner.next().split(" ");
        String[] steps = scanner.next().split(" ");
        Stack<Integer> stack = new Stack<>();
        for (int i = input.length - 1; i >= 0; i--) {
            stack.add(Integer.valueOf(input[i]));
        }
        scanner.close();
        Set<Integer> shiftedBooks = new TreeSet<>();
        List<Integer> result = new LinkedList<>();
        for (String step : steps) {
            int intStep = Integer.parseInt(step);
            if (!shiftedBooks.contains(intStep)) {
                int stepResult = 1;
                Integer book = stack.pop();
                shiftedBooks.add(book);
                while (book != intStep) {
                    stepResult++;
                    book = stack.pop();
                    shiftedBooks.add(book);
                }
                result.add(stepResult);
            } else {
                result.add(0);
            }
        }
        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
