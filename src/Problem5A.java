import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://codeforces.com/problemset/problem/5/A
 */
public class Problem5A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        Set<String> users = new HashSet<>();
        long counter = 0;
        while (scanner.hasNext()) {
            String command = scanner.next();
            if (command.startsWith("+")) {
                users.add(command.substring(1));
            } else if (command.startsWith("-")) {
                users.remove(command.substring(1));
            } else {
                String[] splittedCommand = command.split(":");
                if (splittedCommand.length == 2) {
                    String message = splittedCommand[1];
                    counter += message.length() * users.size();
                }
            }
        }
        scanner.close();
        System.out.println(counter);
    }
}
