import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/711/A
 */
public class Problem711A {

    public static void main(String[] args) {
        List<String[]> input = input();
        boolean isItPossibleToSeatTogether = false;
        for (String[] strings : input) {
            if (strings[0].equals("OO")) {
                strings[0] = "++";
                isItPossibleToSeatTogether = true;
                break;
            }
            if (strings[1].equals("OO")) {
                strings[1] = "++";
                isItPossibleToSeatTogether = true;
                break;
            }
        }

        if (isItPossibleToSeatTogether) {
            System.out.println("YES");
            for (String[] strings : input) {
                System.out.println(strings[0] + "|" + strings[1]);
            }
        } else {
            System.out.println("NO");
        }
    }

    private static List<String[]> input() {
        List<String[]> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            result.add(scanner.next().split("\\|"));
        }
        scanner.close();
        return result;
    }
}
