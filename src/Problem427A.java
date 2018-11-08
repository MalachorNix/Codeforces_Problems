import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/427/A
 */
public class Problem427A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = scanner.nextInt();
        String[] input = scanner.next().split(" ");
        scanner.close();

        int result = 0;
        int policeman = 0;

        for (String s : input) {
            int i = Integer.parseInt(s);
            if (i == -1 && policeman == 0) {
                result++;
            } else if (i == -1) {
                policeman--;
            } else {
                policeman += i;
            }
        }

        System.out.println(result);
    }
}
