import java.util.*;

public class Problem540A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        scanner.nextInt();
        String[] start = scanner.next().split("");
        String[] cipher = scanner.next().split("");
        scanner.close();

        int result = 0;

        List<Integer> digits = new ArrayList<>();
        digits.add(0);
        digits.add(1);
        digits.add(2);
        digits.add(3);
        digits.add(4);
        digits.add(5);
        digits.add(6);
        digits.add(7);
        digits.add(8);
        digits.add(9);

        for (int i = 0; i < start.length; i++) {
            int disc = Integer.parseInt(start[i]);
            int answer = Integer.parseInt(cipher[i]);
            int back = 0;
            int forward = 0;

            if (disc != answer) {
                ListIterator<Integer> backIterator = digits.listIterator(disc);
                boolean foundBack = false;
                while (backIterator.hasPrevious()) {
                    Integer previous = backIterator.previous();
                    back++;
                    if (previous == answer) {
                        foundBack = true;
                        break;
                    }
                }

                if (!foundBack) {
                    back = 10 - answer + back;
                }

                ListIterator<Integer> forwardIterator = digits.listIterator(disc);
                forwardIterator.next();
                boolean foundForward = false;
                while (forwardIterator.hasNext()) {
                    Integer next = forwardIterator.next();
                    forward++;
                    if (next == answer) {
                        foundForward = true;
                        break;
                    }
                }

                if (!foundForward) {
                    forward = forward + answer + 1;
                }


                result += Math.min(forward, back);
            }

        }

        System.out.println(result);
    }
}
