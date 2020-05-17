import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/69/A
 */
public class Problem69A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        Integer[][] vectors = new Integer[n][3];
        for (int i = 0; i < n; i++) {
            String[] strVector = scanner.next().split(" ");
            vectors[i][0] = Integer.valueOf(strVector[0]);
            vectors[i][1] = Integer.valueOf(strVector[1]);
            vectors[i][2] = Integer.valueOf(strVector[2]);
        }
        scanner.close();
        int counter = 0;
        for (int i = 0; i < vectors.length; i++) {
            counter += vectors[i][0];
        }

        if (counter != 0) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < vectors.length; i++) {
                counter += vectors[i][1];
            }
            if (counter != 0) {
                System.out.println("NO");
            } else {
                for (int i = 0; i < vectors.length; i++) {
                    counter += vectors[i][2];
                }
                if (counter != 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}
