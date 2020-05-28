import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/120/A
 */
public class Problem120A {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter output = new PrintWriter("output.txt");
        scanner.useDelimiter(System.lineSeparator());
        String side = scanner.next();
        String handrail = scanner.next();
        String result;
        if (side.equals("front") && handrail.equals("1")) {
            result = "L";
        } else if (side.equals("front") && handrail.equals("2")) {
            result = "R";
        } else if (side.equals("back") && handrail.equals("1")) {
            result = "R";
        } else {
            result = "L";
        }
        output.println(result);
        output.flush();
    }
}
