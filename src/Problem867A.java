import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem867A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        scanner.next();
        String input = scanner.next();
        scanner.close();

        List<String> pairs = new LinkedList<>();
        int beginIndex = 0;
        int endIndex = 2;
        for (int i = 0; i < input.length(); i++) {
            String pair = input.substring(beginIndex++, endIndex++);
            if (pair.length() == 2) {
                pairs.add(pair);
            }
            if (endIndex >= input.length() + 1) {
                endIndex--;
            }
        }

        int toF = 0;
        int toS = 0;
        for (String pair : pairs) {
            if (pair.equals("SF")) {
                toF++;
            } else if (!pair.equals("FF") && !pair.equals("SS")) {
                toS++;
            }
        }

        if (toF > toS) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
