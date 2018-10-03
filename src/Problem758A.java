import java.util.*;

public class Problem758A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int numberOfCitizens = Integer.parseInt(scanner.next());
        List<Integer> citizensMoney = new ArrayList<>();
        for (int i : Arrays.stream(scanner.next().split(" ")).mapToInt(Integer::valueOf).toArray()) {
            citizensMoney.add(i);
        }
        scanner.close();

        Integer max = Collections.max(citizensMoney);

        int count = 0;

        for (Integer citizenMoney : citizensMoney) {
            if (citizenMoney < max) {
                count += max - citizenMoney;
            }
        }

        System.out.println(count);
    }
}
