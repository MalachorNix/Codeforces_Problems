import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem228A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] strColors = scanner.next().split(" ");
        scanner.close();

        int count = 0;
        Set<String> usedColors = new HashSet<>();
        for (int i = 0; i < strColors.length; i++) {
            String color = strColors[i];
            for (int j = i + 1; j < strColors.length; j++) {
                String nextColor = strColors[j];
                if (color.equals(nextColor) && !usedColors.contains(color)) {
                    count++;
                }
            }
            usedColors.add(color);
        }

        System.out.println(count);
    }
}
