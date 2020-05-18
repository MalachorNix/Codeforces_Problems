import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/579/A
 */
public class Problem579A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        scanner.close();
        String binaryN = Integer.toBinaryString(n);
        int numberOfOnes = 0;
        for (char c : binaryN.toCharArray()) {
            if (c == '1') {
                numberOfOnes++;
            }
        }
        System.out.println(numberOfOnes);
    }
}
