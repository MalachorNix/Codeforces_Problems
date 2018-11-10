import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/490/A
 */
public class Problem490A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        scanner.nextInt();
        String[] input = scanner.next().split(" ");
        scanner.close();

        List<List<Pair<Integer, Integer>>> completedTeams = new ArrayList<>();
        List<List<Pair<Integer, Integer>>> notCompletedTeams = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int type = Integer.parseInt(input[i]);
            boolean isProcessed = false;
            for (List<Pair<Integer, Integer>> notCompletedTeam : notCompletedTeams) {
                if (!containsPupilWithType(type, notCompletedTeam)) {
                    notCompletedTeam.add(new Pair<>(type, i));
                    isProcessed = true;
                    if (notCompletedTeam.size() == 3) {
                        completedTeams.add(notCompletedTeam);
                    }
                    break;
                }
            }

            if (!isProcessed) {
                List<Pair<Integer, Integer>> newNotCompletedTeam = new ArrayList<>();
                newNotCompletedTeam.add(new Pair<>(type, i));
                notCompletedTeams.add(newNotCompletedTeam);
            }

            notCompletedTeams.removeIf(team -> team.size() == 3);
        }

        int sizeOfCompletedTeams = completedTeams.size();
        System.out.println(sizeOfCompletedTeams);
        if (sizeOfCompletedTeams > 0) {
            for (List<Pair<Integer, Integer>> completedTeam : completedTeams) {
                StringBuilder row = new StringBuilder();
                for (Pair<Integer, Integer> pupil : completedTeam) {
                    row.append(pupil.second + 1).append(" ");
                }
                System.out.println(row.toString().trim());
            }
        }
    }

    private static boolean containsPupilWithType(int type, List<Pair<Integer, Integer>> team) {
        boolean result = false;

        for (Pair<Integer, Integer> pupil : team) {
            if (pupil.first == type) {
                result = true;
                break;
            }
        }

        return result;
    }

    private static class Pair<T, V> {
        private T first;
        private V second;

        Pair(T first, V second) {
            this.first = first;
            this.second = second;
        }

        T getFirst() {
            return first;
        }

        V getSecond() {
            return second;
        }
    }
}
