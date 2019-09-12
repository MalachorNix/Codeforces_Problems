import java.util.*;
import java.util.stream.Collectors;

public class Problem255A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        scanner.next();
        String input = scanner.next();
        scanner.close();

        String[] s = input.split(" ");
        int[] sequence = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            sequence[i] = Integer.parseInt(s[i]);
        }

        Map<String, Integer> map = new TreeMap<>();
        String chest = "chest";
        map.put(chest, 0);
        String biceps = "biceps";
        map.put(biceps, 0);
        String back = "back";
        map.put(back, 0);

        for (int i = 0; i < sequence.length; i++) {
            if (i % 3 == 0) {
                map.put(chest, map.get(chest) + sequence[i]);
            }
            if (i % 3 == 1) {
                map.put(biceps, map.get(biceps) + sequence[i]);
            }
            if (i % 3 == 2) {
                map.put(back, map.get(back) + sequence[i]);
            }
        }

        Optional<Integer> max = map.values().stream().max(Integer::compareTo);
        int maximum = max.get();
        List<String> collect = map.entrySet().stream().filter(stringIntegerEntry -> stringIntegerEntry.getValue().equals(maximum)).map(stringIntegerEntry -> stringIntegerEntry.getKey()).collect(Collectors.toList());
        System.out.println(collect.get(0));
    }
}
