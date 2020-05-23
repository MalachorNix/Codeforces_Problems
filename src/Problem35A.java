import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/35/A
 */
public class Problem35A {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter output = new PrintWriter("output.txt");
        scanner.useDelimiter(System.lineSeparator());
        int ballIndex = Integer.parseInt(scanner.next());
        for (int i = 0; i < 3; i++) {
            String[] s = scanner.next().split(" ");
            int from = Integer.parseInt(s[0]);
            int to = Integer.parseInt(s[1]);
            if (from == ballIndex || to == ballIndex) {
                if (ballIndex == from) {
                    ballIndex = to;
                } else {
                    ballIndex = from;
                }
            }
        }
        output.println(ballIndex);
        output.flush();
    }
}
