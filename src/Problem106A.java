import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/106/A
 */
public class Problem106A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String trumpSuit = scanner.next();
        String[] cards = scanner.next().split(" ");
        scanner.close();
        String firstCard = cards[0];
        String secondCard = cards[1];
        if (firstCard.contains(trumpSuit) && secondCard.contains(trumpSuit)) {
            if (getRank(firstCard.split("")[0]) <= getRank(secondCard.split("")[0])) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } else if (firstCard.contains(trumpSuit)) {
            System.out.println("YES");
        } else if (secondCard.contains(trumpSuit)) {
            System.out.println("NO");
        } else if (firstCard.split("")[1].equals(secondCard.split("")[1])) {
            if (getRank(firstCard.split("")[0]) <= getRank(secondCard.split("")[0])) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }
    }

    private static int getRank(String strRank) {
        switch (strRank) {
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "T":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return 15;
        }
    }
}
