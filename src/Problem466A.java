import java.util.*;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/466/A
 */
public class Problem466A {

    public static void main(String[] args) {
        String[] array = input();
        int planned = Integer.parseInt(array[0]);
        int abonement = Integer.parseInt(array[1]);
        int oneTripCost = Integer.parseInt(array[2]);
        int abonementCost = Integer.parseInt(array[3]);
        int allTripsWithoutAbonementCost = planned * oneTripCost;
        int allTripsWithAbonementCost =
                planned % abonement == 0 ?
                        (planned / abonement) * abonementCost :
                        ((planned / abonement) + 1) * abonementCost;
        int intAbonementCostTotal = (planned / abonement) * abonementCost;
        int betterBuyAdditionalOneTrips = (planned % abonement) * oneTripCost + intAbonementCostTotal;
        List<Integer> list = new ArrayList<>();
        list.add(allTripsWithoutAbonementCost);
        list.add(allTripsWithAbonementCost);
        list.add(betterBuyAdditionalOneTrips);
        Integer min = Collections.min(list);
        System.out.println(min);
    }

    private static String[] input() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] result = scanner.next().split(" ");
        scanner.close();
        return result;
    }
}
