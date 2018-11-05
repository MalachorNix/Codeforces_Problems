import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/451/A
 */
public class Problem451A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] nm = scanner.next().split(" ");
        scanner.close();

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] board = new int[n][m];

        int turn = 0;
        Context context = isExists(board);
        boolean exists;
        do {
            Integer nIndex = context.nIndex;
            Integer mIndex = context.mIndex;

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (i == nIndex || j == mIndex) {
                        board[i][j] = 1;
                    }
                }
            }

            context = isExists(board);
            exists = context.exists;
            turn++;
        } while (exists);


        if (turn % 2 == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }
    }

    private static Context isExists(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    return new Context(i, j, true);
                }
            }
        }
        return new Context(null, null, false);
    }

    private static class Context {
        private Integer nIndex;
        private Integer mIndex;
        private boolean exists;

        Context(Integer nIndex, Integer mIndex, boolean exists) {
            this.nIndex = nIndex;
            this.mIndex = mIndex;
            this.exists = exists;
        }
    }
}
