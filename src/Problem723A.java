import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/723/A
 */
public class Problem723A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] input = scanner.next().split(" ");
        scanner.close();

        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(input[0]));
        list.add(Integer.parseInt(input[1]));
        list.add(Integer.parseInt(input[2]));
        Collections.sort(list);

        List<Integer> collection = new ArrayList<>();
        collection.add(list.get(1) + list.get(2) - 2 * list.get(0));
        collection.add(list.get(1) - list.get(0) + list.get(2) - list.get(1));
        collection.add(list.get(2) - list.get(0) + list.get(2) - list.get(1));

        System.out.println(Collections.min(collection));
    }

    // ---*1--*4-*7---
}
