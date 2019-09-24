import java.util.Scanner;

public class Problem75A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String strA = scanner.next();
        String strB = scanner.next();
        scanner.close();
        long sum = Long.parseLong(strA) + Long.parseLong(strB);
        String strSum = sum + "";
        long aWithoutZeros = Long.parseLong(strA.replaceAll("0", ""));
        long bWithoutZeros = Long.parseLong(strB.replaceAll("0", ""));
        long actualSumWithoutZeroes = aWithoutZeros + bWithoutZeros;
        long prevZoomWithoutZeroes = Long.parseLong(strSum.replaceAll("0", ""));
        if (actualSumWithoutZeroes == prevZoomWithoutZeroes) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
