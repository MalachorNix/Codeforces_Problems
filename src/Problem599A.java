import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/599/A
 */
public class Problem599A {

    public static void main(String[] args) {
        String[] input = input();
        int d1 = Integer.parseInt(input[0]);
        int d2 = Integer.parseInt(input[1]);
        int d3 = Integer.parseInt(input[2]);
        int d1D1D2D2 = 2 * d1 + 2 * d2;
        int d1D3D2 = d1 + d3 + d2;
        int d2D3D3D2 = 2 * d2 + 2 * d3;
        int d1D3D3D1 = 2 * d1 + 2 * d3;
        List<Integer> list = new ArrayList<>();
        list.add(d1D1D2D2);
        list.add(d1D3D2);
        list.add(d2D3D3D2);
        list.add(d1D3D3D1);
        System.out.println(Collections.min(list));
    }

    private static String[] input() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] result = scanner.next().split(" ");
        scanner.close();
        return result;
    }
}
