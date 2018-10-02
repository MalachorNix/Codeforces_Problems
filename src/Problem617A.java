import java.util.Scanner;

public class Problem617A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int x = Integer.parseInt(scanner.next());
        scanner.close();

        if (x <= 5) {
            System.out.println(1);
        } else {
            int remainder = x % 5;
            if (remainder == 0) {
                System.out.println(x / 5);
            } else {
                System.out.println((x / 5) + 1);
            }
        }
    }
}
