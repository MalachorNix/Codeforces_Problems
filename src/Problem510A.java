import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/510/A
 */
public class Problem510A {

    public static void main(String[] args) {
        String[] nm = inputDimension();
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String[][] picture = new String[n][m];
        paint(picture);
        fillEmpty(picture);
        print(picture);
    }

    private static void paint(String[][] picture) {
        boolean paintRightBorder = true;
        for (int i = 0; i < picture.length; i++) {
            if (i % 2 == 0) {
                paintLineCompletely(picture, i);
            } else if (paintRightBorder) {
                paintRightBorder(picture, i);
                paintRightBorder = false;
            } else {
                paintLeftBorder(picture, i);
                paintRightBorder = true;
            }
        }
    }

    private static void paintLeftBorder(String[][] picture, int i) {
        picture[i][0] = "#";
    }

    private static void paintRightBorder(String[][] picture, int i) {
        picture[i][picture[0].length - 1] = "#";
    }

    private static void paintLineCompletely(String[][] picture, int i) {
        for (int j = 0; j < picture[0].length; j++) {
            picture[i][j] = "#";
        }
    }

    private static void fillEmpty(String[][] picture) {
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[0].length; j++) {
                if (!"#".equals(picture[i][j])) {
                    picture[i][j] = ".";
                }
            }
        }
    }

    private static String[] inputDimension() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] nm = scanner.next().split(" ");
        scanner.close();
        return nm;
    }

    private static void print(String[][] picture) {
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[0].length; j++) {
                System.out.print(picture[i][j]);
            }
            System.out.println();
        }
    }
}
