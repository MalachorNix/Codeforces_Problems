import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/816/A
 */
public class Problem816A {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String time = scanner.next();
        scanner.close();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        if (time.replace(":", "").equals(new StringBuilder(time.replace(":", "")).reverse().toString())) {
            System.out.println(0);
        } else {
            int minutes = 0;
            do {
                Date date = simpleDateFormat.parse(time);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.add(Calendar.MINUTE, 1);
                minutes++;
                time = simpleDateFormat.format(calendar.getTime());
            } while (!time.replace(":", "").equals(new StringBuilder(time.replace(":", "")).reverse().toString()));
            System.out.println(minutes);
        }
    }
}
