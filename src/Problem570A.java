import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/570/A
 */
public class Problem570A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] firstInputStr = scanner.next().split(" ");
        int numberOfCandidates = Integer.parseInt(firstInputStr[0]);
        int numberOfCities = Integer.parseInt(firstInputStr[1]);
        Integer[] winners = new Integer[numberOfCities];
        for (int i = 0; i < numberOfCities; i++) {
            String[] cityVotes = scanner.next().split(" ");
            String max = Arrays.stream(cityVotes).mapToInt(Integer::parseInt).max().getAsInt() + "";
            for (int j = 0; j < cityVotes.length; j++) {
                if (cityVotes[j].equals(max)) {
                    winners[i] = j;
                    break;
                }
            }
        }
        scanner.close();
        Set<Map.Entry<Integer, Long>> winnersWithNumberOfVotes = Arrays.stream(winners).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet();
        Long maxVotes = winnersWithNumberOfVotes.stream().max(Comparator.comparing(Map.Entry::getValue)).get().getValue();
        Optional<Map.Entry<Integer, Long>> winner = winnersWithNumberOfVotes.stream().filter(e -> e.getValue().equals(maxVotes)).min((e1, e2) -> e1.getKey().compareTo(e2.getKey()));
        System.out.println(winner.get().getKey() + 1);
    }
}
