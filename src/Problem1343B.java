import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Problem1343B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int subarrayLength = n / 2;
            if (subarrayLength % 2 == 1) {
                System.out.println("NO");
            } else {
                long[] evens = new long[subarrayLength];
                long[] ordinaries = new long[subarrayLength];
                long evensSum = 0;
                long ordinariesSum = 0;
                for (int j = 0; j < subarrayLength; j++) {
                    evens[j] = 2 * (j + 1);
                    evensSum += evens[j];
                    ordinaries[j] = 2 * j + 1;
                    ordinariesSum += ordinaries[j];
                }
                ordinariesSum -= ordinaries[subarrayLength - 1];
                ordinaries[subarrayLength - 1] = evensSum - ordinariesSum;
                String result = LongStream.of(evens).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + " ";
                result += LongStream.of(ordinaries).mapToObj(String::valueOf).collect(Collectors.joining(" "));
                System.out.println("YES");
                System.out.println(result);
            }
        }
        br.close();
    }
}
