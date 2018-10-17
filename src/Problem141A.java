import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/141/A?locale=en
 */
public class Problem141A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] firstName = scanner.next().split("");
        String[] secondName = scanner.next().split("");
        String[] heap = scanner.next().split("");
        scanner.close();

        Map<String, Integer> lettersInNames = new HashMap<>();
        countLetters(firstName, lettersInNames);
        countLetters(secondName, lettersInNames);

        Map<String, Integer> lettersInHeap = new HashMap<>();
        countLetters(heap, lettersInHeap);

        boolean isPossibleToMakeNames = true;
        if (lettersInHeap.size() == lettersInNames.size()) {
            for (Map.Entry<String, Integer> letterCount : lettersInNames.entrySet()) {
                if (!containsLetter(lettersInHeap, letterCount) || !lettersInHeap.get(letterCount.getKey()).equals(letterCount.getValue())) {
                    isPossibleToMakeNames = false;
                    break;
                }
            }
        } else {
            isPossibleToMakeNames = false;
        }

        System.out.println(isPossibleToMakeNames ? "YES" : "NO");
    }

    private static boolean containsLetter(Map<String, Integer> lettersInHeap, Map.Entry<String, Integer> letterCount) {
        return lettersInHeap.get(letterCount.getKey()) != null;
    }

    private static void countLetters(String[] name, Map<String, Integer> letters) {
        for (String letter : name) {
            Integer count = letters.get(letter);
            if (count == null) {
                count = 0;
            }
            count++;
            letters.put(letter, count);
        }
    }
}
