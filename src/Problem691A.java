import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem691A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int n = Integer.parseInt(scanner.next());
        List<Integer> list = new ArrayList<>(n);
        String[] s = scanner.next().split(" ");
        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(s[i]));
        }
        scanner.close();
        if (list.size() == 1 && list.get(0) == 0) {
            System.out.println("NO");
        } else if (list.size() == 1 && list.get(0) == 1) {
            System.out.println("YES");
        } else {
            boolean wasOpen = false;
            boolean no = false;
            for (Integer integer : list) {
                if (integer == 0 && !wasOpen) {
                    wasOpen = true;
                    continue;
                }
                if (integer == 0) {
//                    System.out.println("NO");
                    no = true;
                    break;
                }
            }
            if (!no && wasOpen) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
