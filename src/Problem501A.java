import java.util.Scanner;

public class Problem501A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] abcd = scanner.next().split(" ");
        scanner.close();
        int a = Integer.parseInt(abcd[0]);
        int b = Integer.parseInt(abcd[1]);
        int c = Integer.parseInt(abcd[2]);
        int d = Integer.parseInt(abcd[3]);

        Integer mishaPoints = Math.max(3 * a / 10, a - ((a / 250) * c));
        Integer vasyaPoints = Math.max(3 * b / 10, b - ((b / 250) * d));
        int result = mishaPoints.compareTo(vasyaPoints);
        if (result > 0) {
            System.out.println("Misha");
        } else if (result < 0) {
            System.out.println("Vasya");
        } else {
            System.out.println("Tie");
        }
    }
}
