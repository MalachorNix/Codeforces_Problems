import java.util.Objects;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/263/A?locale=en
 */
public class Problem263A {

    public static void main(String[] args) {
        String[] strMatrix = inputMatrix();
        int[][] matrix = transform(strMatrix);
        MatrixPosition center = new MatrixPosition(2, 2);
        MatrixPosition positionOfOne = findOne(matrix);
        if (positionOfOne != null) {
            if (positionOfOne.equals(center)) {
                System.out.println(0);
            } else {
                if (positionOfOne.getI() == center.getI()) {
                    System.out.println(Math.abs(positionOfOne.getJ() - center.getJ()));
                } else {
                    System.out.println(Math.abs(positionOfOne.getI() - center.getI()) + Math.abs(positionOfOne.getJ() - center.getJ()));
                }
            }
        }
    }


    private static MatrixPosition findOne(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    return new MatrixPosition(i, j);
                }
            }
        }
        return null;
    }

    private static int[][] transform(String[] strMatrix) {
        int matrix[][] = new int[5][5];

        for (int i = 0, strMatrixLength = strMatrix.length; i < strMatrixLength; i++) {
            String row = strMatrix[i];
            String[] splittedRow = row.split(" ");
            for (int j = 0; j < splittedRow.length; j++) {
                matrix[i][j] = Integer.parseInt(splittedRow[j]);
            }
        }

        return matrix;
    }

    private static String[] inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] strMatrix = new String[5];
        for (int i = 0; i < strMatrix.length; i++) {
            strMatrix[i] = scanner.next();
        }
        scanner.close();
        return strMatrix;
    }

    private static class MatrixPosition {
        private int i;
        private int j;

        public MatrixPosition(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MatrixPosition that = (MatrixPosition) o;
            return i == that.i &&
                    j == that.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}
