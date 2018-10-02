import java.util.Scanner;

public class Problem486A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        long n = Long.parseLong(scanner.next());
        scanner.close();

        long result;

        if (n % 2 == 0) {
            result = n / 2;
        } else {
            result = -((n + 1) / 2);
        }

        System.out.println(result);
    }
}
