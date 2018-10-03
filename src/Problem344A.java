import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem344A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        List<String> magnets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            magnets.add(scanner.next());
        }
        scanner.close();

        int countOfIslands = 1;

        String currentElement = magnets.get(0);

        for (int i = 0; i < magnets.size(); i++) {
            String magnet = magnets.get(i);
            if (!currentElement.equals(magnet)) {
                countOfIslands++;
                    currentElement = magnets.get(i);
            }
        }

        System.out.println(countOfIslands);
    }
}
