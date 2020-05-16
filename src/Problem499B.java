import java.util.*;

/**
 * http://codeforces.com/problemset/problem/499/B
 */
public class Problem499B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] first = scanner.next().split(" ");
        int numberOfWordsInLecture = Integer.parseInt(first[0]);
        int numberOfWordsInLanguage = Integer.parseInt(first[1]);
        Map<String, String> dictionary = new HashMap<>();
        for (int i = 0; i < numberOfWordsInLanguage; i++) {
            String[] words = scanner.next().split(" ");
            String resultWord;
            if (words[0].length() <= words[1].length()) {
                resultWord = words[0];
            } else {
                resultWord = words[1];
            }
            dictionary.put(words[0], resultWord);
        }
        String[] lecture = scanner.next().split(" ");
        scanner.close();
        List<String> resultList = new LinkedList<>();
        for (String word : lecture) {
            resultList.add(dictionary.get(word));
        }
        System.out.println(String.join(" ", resultList));
    }
}
