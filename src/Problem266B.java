import java.util.Arrays;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/266/B
 */
public class Problem266B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] nt = scanner.next().split(" ");
        String[] queue = scanner.next().split("");
        scanner.close();

        int time = Integer.parseInt(nt[1]);
        int ignoreIndex = -1;

        for (int tick = 0; tick < time; tick++) {
            for (int i = 0; i < queue.length; i++) {
                if (i != queue.length - 1 && i != ignoreIndex) {
                    if (queue[i].equals("B") && queue[i + 1].equals("G")) {
                        queue[i] = "G";
                        queue[i + 1] = "B";
                        ignoreIndex = i + 1;
                    }
                }
            }
            ignoreIndex = -1;
        }

        Arrays.stream(queue).forEach(System.out::print);
    }
}
