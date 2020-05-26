import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/724/A
 */
public class Problem724A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String firstDay = scanner.next();
        int first = convert(firstDay);
        String secondDay = scanner.next();
        int second = convert(secondDay);
        scanner.close();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(0L));
        boolean result = false;
        while (calendar.get(Calendar.YEAR) != 2100 && !result) {
            Date date = calendar.getTime();
            if (calendar.get(Calendar.YEAR) % 4 != 0) {
                Date startOfMonth = date;
                for (int i = 0; i < 11; i++) {
                    int f = calendar.get(Calendar.DAY_OF_WEEK);
                    calendar.add(Calendar.MONTH, 1);
                    int s = calendar.get(Calendar.DAY_OF_WEEK);
                    if (f == first && s == second) {
                        result = true;
                        break;
                    }
                }
            }
            calendar.setTime(date);
            calendar.add(Calendar.YEAR, 1);
        }
        System.out.println(result ? "YES" : "NO");
    }

    private static int convert(String day) {
        switch (day) {
            case "monday":
                return 1;
            case "tuesday":
                return 2;
            case "wednesday":
                return 3;
            case "thursday":
                return 4;
            case "friday":
                return 5;
            case "saturday":
                return 6;
            case "sunday":
                return 7;
            default:
                return 0;
        }
    }
}
