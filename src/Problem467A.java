import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/467/A?locale=en
 */
public class Problem467A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int numberOfRooms = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < numberOfRooms; i++) {
            String[] pair = scanner.next().split(" ");
            int difference = Integer.parseInt(pair[1]) - Integer.parseInt(pair[0]);
            if (difference >= 2) {
                count++;
            }
        }
        scanner.close();
        System.out.println(count);
    }
}
