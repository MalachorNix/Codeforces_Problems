import java.util.Scanner;

public class Problem509A {

    public static void main(String[] args) {
        int n = input();
        int[][] matrix = new int[n][n];
        fillOne(matrix);
        fillRestOfThe(matrix);
        int max = findMaxOfThe(matrix);
        System.out.println(max);
    }

    private static int findMaxOfThe(int[][] matrix) {
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    private static void fillRestOfThe(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
        }
    }

    private static void fillOne(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 1;
                }
            }
        }
    }


    private static int input() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int result = scanner.nextInt();
        scanner.close();
        return result;
    }
}
