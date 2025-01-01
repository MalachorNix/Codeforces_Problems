import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem2051B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            var nabc = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toUnmodifiableList());
            var sum = nabc.get(1) + nabc.get(2) + nabc.get(3);
            int cycles = nabc.get(0) / sum;
            int day = cycles * 3;
            int kms = cycles * sum;
            if (nabc.get(0) == kms) {
                System.out.println(day);
            } else {
                day++;
                kms += nabc.get(1);
                if (kms >= nabc.get(0)) {
                    System.out.println(day);
                } else {
                    day++;
                    kms += nabc.get(2);
                    if (kms >= nabc.get(0)) {
                        System.out.println(day);
                    } else {
                        day++;
                        System.out.println(day);
                    }
                }
            }
        }
        br.close();
    }

}
