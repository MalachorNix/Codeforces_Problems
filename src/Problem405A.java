import java.util.Arrays;
import java.util.Scanner;

public class Problem405A {

    public static void main(String[] args) {
        int[] cubesInColumns = inputIntArray();
        int maxRows = Arrays.stream(cubesInColumns).max().getAsInt();
        int[][] box = new int[maxRows][cubesInColumns.length];
        fillBox(cubesInColumns, box);
        turnBox(maxRows, box);
        int[] cubesInColumnsAfterTurn = calculateResult(cubesInColumns, maxRows, box);
        printResult(cubesInColumnsAfterTurn);
    }

    private static void printResult(int[] cubesInColumnsAfterTurn) {
        for (int numberOfCubes : cubesInColumnsAfterTurn) {
            System.out.print(numberOfCubes + " ");
        }
    }

    private static int[] calculateResult(int[] cubesInColumns, int maxRows, int[][] box) {
        int[] cubesInColumnsAfterTurn = new int[cubesInColumns.length];
        for (int column = 0; column < cubesInColumns.length; column++) {
            int value = 0;
            for (int row = maxRows - 1; row >= 0; row--) {
                value += box[row][column];
            }
            cubesInColumnsAfterTurn[column] = value;
        }
        return cubesInColumnsAfterTurn;
    }

    private static void turnBox(int maxRows, int[][] box) {
        for (int column = box[0].length - 2; column >= 0; column--) {
            for (int row = 0; row < maxRows; row++) {
                int bias = 0;
                while (column + bias + 1 < box[0].length) {
                    if (box[row][column + bias] == 1 && box[row][column + bias + 1] == 0) {
                        box[row][column + bias] = 0;
                        box[row][column + bias + 1] = 1;
                    }
                    bias++;
                }
            }
        }
    }

    private static void fillBox(int[] cubesInColumns, int[][] box) {
        for (int column = 0; column < box[0].length; column++) {
            int cubes = cubesInColumns[column];
            for (int row = box.length - 1; row >= 0; row--) {
                if (cubes != 0) {
                    box[row][column] = 1;
                    cubes--;
                } else {
                    box[row][column] = 0;
                }
            }
        }
    }

    private static int[] inputIntArray() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        scanner.next();
        String[] s = scanner.next().split(" ");
        scanner.close();
        int[] result = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            result[i] = Integer.parseInt(s[i]);
        }
        return result;
    }
}
