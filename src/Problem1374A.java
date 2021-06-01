import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1374A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            long[] a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
            long x = a[0];
            long y = a[1];
            long n = a[2];
            long result = 0;
            long remainder = n % x;
            if (remainder == y) {
                result = n;
            } else {
                long nMinusRemainder = n - remainder;
                result = nMinusRemainder + y;
                if (result > n) {
                    result = nMinusRemainder - x + y;
                } else {
                    result = nMinusRemainder + y;
                }
            }
            System.out.println(result);
        }
        br.close();
    }
}
