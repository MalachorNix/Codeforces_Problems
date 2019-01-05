import java.util.Scanner;

public class Problem707A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] size = scanner.next().split(" ");
        int columns = Integer.parseInt(size[1]);
        int rows = Integer.parseInt(size[0]);
        String[][] matrix = new String[rows][columns];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.next().split(" ");
        }
        scanner.close();

        boolean isColor = isColor(matrix);
        if (isColor) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }
    }

    private static boolean isColor(String[][] matrix) {
        boolean isColor = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                String pixel = matrix[row][column];
                if (!pixel.equals("W") && !pixel.equals("G") && !pixel.equals("B")) {
                    return true;
                }
            }
        }
        return isColor;
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
