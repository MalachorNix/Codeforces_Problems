import java.util.*;
import java.util.stream.Collectors;

public class Problem218B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] nm = scanner.next().split(" ");
        String[] a = scanner.next().split(" ");
        scanner.close();
        int numberOfPassengers = Integer.parseInt(nm[0]);
        int numberOfPlanes = Integer.parseInt(nm[1]);
        Comparator<Integer> reverseComparator = (integer, t1) -> -integer.compareTo(t1);
        List<Integer> planesForMax = Arrays.stream(a).
                map(Integer::parseInt).
                sorted(reverseComparator).
                collect(Collectors.toCollection(LinkedList::new));
        List<Integer> planesForMin = Arrays.stream(a).
                map(Integer::parseInt).
                sorted().
                collect(Collectors.toCollection(LinkedList::new));
        int max = 0, min = 0;
        for (int i = 0; i < numberOfPassengers; i++) {
            boolean toDelete = false;
            int updatedNumberOfFreePlaces = 0;
            for (Integer numberOfFreePlaces : planesForMax) {
                max += numberOfFreePlaces;
                numberOfFreePlaces--;
                if (numberOfFreePlaces == 0) {
                    toDelete = true;
                } else {
                    updatedNumberOfFreePlaces = numberOfFreePlaces;
                }
                break;
            }
            if (toDelete) {
                planesForMax.remove(0);
            } else {
                planesForMax.remove(0);
                planesForMax.add(0, updatedNumberOfFreePlaces);
            }
            Collections.sort(planesForMax, reverseComparator);
        }

        for (int i = 0; i < numberOfPassengers; i++) {
            boolean toDelete = false;
            int updatedNumberOfFreePlaces = 0;
            for (Integer numberOfFreePlaces : planesForMin) {
                min += numberOfFreePlaces;
                numberOfFreePlaces--;
                if (numberOfFreePlaces == 0) {
                    toDelete = true;
                } else {
                    updatedNumberOfFreePlaces = numberOfFreePlaces;
                }
                break;
            }
            if (toDelete) {
                planesForMin.remove(0);
            } else {
                planesForMin.remove(0);
                planesForMin.add(0, updatedNumberOfFreePlaces);
            }
            Collections.sort(planesForMin);
        }


        System.out.println(max + " " + min);

    }
}
