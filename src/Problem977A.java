import java.util.Scanner;

public class Problem977A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] input = scanner.next().split(" ");
        scanner.close();

        int number = Integer.parseInt(input[0]);
        int times = Integer.parseInt(input[1]);

        for (int i = 0; i < times; i++) {
            if (number % 10 == 0) {
                number /= 10;
            } else {
                number -= 1;
            }
        }

        System.out.println(number);
    }
}
