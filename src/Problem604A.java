import java.math.BigDecimal;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/604/A
 */
public class Problem604A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] strMinutes = scanner.next().split(" ");
        String[] strWrongAttempts = scanner.next().split(" ");
        String[] strHacks = scanner.next().split(" ");
        Long[] pointsList = {500L, 1000L, 1500L, 2000L, 2500L};
        scanner.close();
        BigDecimal result = BigDecimal.ZERO;
        for (int i = 0; i < strMinutes.length; i++) {
            String strMinute = strMinutes[i];
            String strWrongAttempt = strWrongAttempts[i];
            BigDecimal a = BigDecimal.valueOf(0.3).multiply(BigDecimal.valueOf(pointsList[i]));
            BigDecimal b = (BigDecimal.ONE.subtract(BigDecimal.valueOf(Long.parseLong(strMinute)).divide(BigDecimal.valueOf(250L)))).multiply(BigDecimal.valueOf(pointsList[i])).subtract(BigDecimal.valueOf(50L).multiply(BigDecimal.valueOf(Long.parseLong(strWrongAttempt))));
            result = result.add(max(a, b));
        }
        result = result.add(BigDecimal.valueOf(100L).multiply(BigDecimal.valueOf(Long.parseLong(strHacks[0]))));
        result = result.subtract(BigDecimal.valueOf(50L).multiply(BigDecimal.valueOf(Long.parseLong(strHacks[1]))));
        System.out.println(result.longValue());
    }

    private static BigDecimal max(BigDecimal a, BigDecimal b) {
        return a.max(b);
    }
}
