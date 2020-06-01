import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/535/A
 */
public class Problem535A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String number = scanner.next();
        scanner.close();
        System.out.println(transform(number));
    }

    private static String transform(String s) {
        switch (s) {
            case "0":
                return "zero";
            case "1":
                return "one";
            case "2":
                return "two";
            case "3":
                return "three";
            case "4":
                return "four";
            case "5":
                return "five";
            case "6":
                return "six";
            case "7":
                return "seven";
            case "8":
                return "eight";
            case "9":
                return "nine";
            case "10":
                return "ten";
            case "11":
                return "eleven";
            case "12":
                return "twelve";
            case "13":
                return "thirteen";
            case "14":
                return "fourteen";
            case "15":
                return "fifteen";
            case "16":
                return "sixteen";
            case "17":
                return "seventeen";
            case "18":
                return "eighteen";
            case "19":
                return "nineteen";
            case "20":
                return "twenty";
            case "30":
                return "thirty";
            case "40":
                return "forty";
            case "50":
                return "fifty";
            case "60":
                return "sixty";
            case "70":
                return "seventy";
            case "80":
                return "eighty";
            case "90":
                return "ninety";
            default:
                String[] digits = s.split("");
                return transform(digits[0] + "0") + "-" + transform(digits[1]);
        }
    }
}
