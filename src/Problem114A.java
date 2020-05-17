import java.math.BigDecimal;
import java.util.Scanner;

public class Problem114A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        BigDecimal k  = BigDecimal.valueOf(Integer.parseInt(scanner.next()));
        BigDecimal originalK  = k;
        BigDecimal l  = BigDecimal.valueOf(Integer.parseInt(scanner.next()));
        scanner.close();
        int counter = 0;
        while (k.compareTo(l) < 0) {
            k = k.multiply(originalK);
            counter++;
        }
        if (k.compareTo(l) == 0) {
            System.out.println("YES");
            System.out.println(counter);
        } else {
            System.out.println("NO");
        }
    }
}
