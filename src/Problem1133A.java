import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/1133/A
 */
public class Problem1133A {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String start = scanner.next();
        String finish = scanner.next();
        scanner.close();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        long startMs = simpleDateFormat.parse(start).getTime();
        long finishMs = simpleDateFormat.parse(finish).getTime();
        long middleTime = (startMs + finishMs) / 2;
        System.out.println(simpleDateFormat.format(new Date(middleTime)));
    }
}
