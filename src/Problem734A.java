import java.util.Scanner;

public class Problem734A {

    public static void main(String[] args) {
        char[] results = inputResults();
        int n = results.length;
        int antonWinTimes = 0;
        for (char result : results) {
            if (result == 'A') {
                antonWinTimes++;
            }
        }
        if (antonWinTimes > n - antonWinTimes) {
            System.out.println("Anton");
        } else if (antonWinTimes < n - antonWinTimes) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }

    private static char[] inputResults() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        Integer n = Integer.valueOf(scanner.next());
        char[] results = scanner.next().toCharArray();
        scanner.close();
        return results;
    }
}
