import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem80A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var symbols = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toUnmodifiableList());
        int n = symbols.get(0);
        int m = symbols.get(1);
        Boolean result = null;
        for (int i = n + 1; i < m; i++) {
            if (isPrime(i)) {
                result = false;
                break;
            }
        }
        if (result == null) {
            result = isPrime(m);
        }
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        br.close();
    }

    private static boolean isPrime(int number) {
        BigInteger bigInt = BigInteger.valueOf(number);
        return bigInt.isProbablePrime(100);
    }
}
