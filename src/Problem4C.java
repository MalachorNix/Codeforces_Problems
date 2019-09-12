import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int numberOfStrings = Integer.parseInt(scanner.next());
        Map<String, Long> map = new HashMap<>();
        for (int i = 0; i < numberOfStrings; i++) {
            String input = scanner.next();
            Long value = map.get(input);
            if (value == null) {
                map.put(input, 0L);
                System.out.println("OK");
            } else {
                value++;
                map.put(input, value);
                System.out.println(input + value);
            }
        }
        scanner.close();
    }
}
