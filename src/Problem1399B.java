import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1399B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long[] a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
            long[] b = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

            long aMin = Arrays.stream(a).min().getAsLong();
            long bMin = Arrays.stream(b).min().getAsLong();

            long result = 0;
            for (int j = 0; j < n; j++) {
                long currentResult = 0;
                long minToTarget = Math.min(a[j] - aMin, b[j] - bMin);
                currentResult += minToTarget;
                currentResult += a[j] - minToTarget - aMin;
                currentResult += b[j] - minToTarget - bMin;
                result += currentResult;
            }
            System.out.println(result);
        }
        br.close();
    }
}
