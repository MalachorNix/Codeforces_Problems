import java.util.Scanner;

public class Problem1351A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            String[] strPair = scanner.next().split(" ");
            result[i] = Integer.parseInt(strPair[0]) + Integer.parseInt(strPair[1]);
        }
        scanner.close();
        for (int i : result) {
            System.out.println(i);
        }
    }
}
