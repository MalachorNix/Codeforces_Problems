import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/450/A
 */
public class Problem450A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] firstString = scanner.next().split(" ");
        String[] secondString = scanner.next().split(" ");
        scanner.close();
        int n = Integer.parseInt(firstString[0]);
        int m = Integer.parseInt(firstString[1]);
        Queue<Triple<Integer, Integer, Integer>> queue = new LinkedList<>();
        for (int i = 0; i < secondString.length; i++) {
            queue.add(new Triple<>(i, Integer.parseInt(secondString[i]), 0));
        }

        while (queue.size() != 1) {
            Triple<Integer, Integer, Integer> child = queue.poll();
            child.setReceived(child.getReceived() + m);
            if (child.getReceived() < child.getRequired()) {
                queue.add(child);
            }
        }

        System.out.println(queue.poll().getOriginIndex() + 1);
    }

    private static class Triple<F, S, T> {
        private F originIndex;
        private S required;
        private T received;

        Triple(F originIndex, S required, T received) {
            this.originIndex = originIndex;
            this.required = required;
            this.received = received;
        }

        F getOriginIndex() {
            return originIndex;
        }

        S getRequired() {
            return required;
        }

        public T getReceived() {
            return received;
        }

        public void setOriginIndex(F originIndex) {
            this.originIndex = originIndex;
        }

        public void setRequired(S required) {
            this.required = required;
        }

        public void setReceived(T received) {
            this.received = received;
        }
    }
}
