import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1551B1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            Map<Character, Long> charFrequency = Stream.of(s)
                    .flatMap(a -> a.chars().mapToObj(c -> (char) c))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            int result = 0;
            int numOfSolos = 0;
            for (Map.Entry<Character, Long> entry : charFrequency.entrySet()) {
                if (entry.getValue() >= 2) {
                    result++;
                } else {
                    numOfSolos++;
                }
            }
            result += numOfSolos / 2;
            System.out.println(result);
        }
        br.close();
    }
}
