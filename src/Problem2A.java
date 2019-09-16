import java.util.*;
import java.util.stream.Collectors;

public class Problem2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int numberOfStrings = Integer.parseInt(scanner.next());
        List<Entry> input = new ArrayList<>(numberOfStrings);
        for (int i = 0; i < numberOfStrings; i++) {
            String[] s = scanner.next().split(" ");
            input.add(new Entry(s[0], Integer.parseInt(s[1])));
        }
        scanner.close();
        Integer maxScore = Integer.MIN_VALUE;
        Map<String, Integer> mappedResults = new HashMap<>();
        for (Entry entry : input) {
            Integer integer = mappedResults.get(entry.name);
            if (integer == null) {
                mappedResults.put(entry.name, entry.score);
            } else {
                mappedResults.put(entry.name, integer + entry.score);
            }
            maxScore = recalculateMaxScore(mappedResults);
        }

        Integer finalMaxScore = maxScore;
        List<String> guysWithMaxScore = mappedResults.
                entrySet().
                stream().
                filter(totalResult -> totalResult.getValue().equals(finalMaxScore)).
                map(Map.Entry::getKey).
                collect(Collectors.toList());

        Map<String, Integer> scoresPerGuysByStep = new LinkedHashMap<>();
        String winner = "";
        for (Entry entry : input) {
            if (guysWithMaxScore.contains(entry.name)) {
                Integer score = scoresPerGuysByStep.get(entry.name);
                if (score != null) {
                    scoresPerGuysByStep.put(entry.name, score + entry.score);
                } else {
                    scoresPerGuysByStep.put(entry.name, entry.score);
                }
                int currentScore = scoresPerGuysByStep.get(entry.name);
                if (currentScore >= maxScore) {
                    winner = entry.name;
                    break;
                }
            }
        }

        System.out.println(winner);
    }

    private static Integer recalculateMaxScore(Map<String, Integer> mappedResults) {
        return mappedResults.values().stream().max(Integer::compareTo).get();
    }

    private static class Entry {
        public String name = "";
        public int score;

        public Entry(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }
    }
}
