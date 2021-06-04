import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1353B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            long[] a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).sorted().toArray();
            long[] b = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).sorted().toArray();
            for (int j = 0; j < k; j++) {
                if (a[j] < b[a.length - 1 - j]) {
                    long temp = b[a.length - 1 - j];
                    a[j] = b[a.length - 1 - j];
                    b[a.length - 1 - j] = temp;
                } else {
                    break;
                }
            }
            System.out.println(Arrays.stream(a).sum());
        }
        br.close();
    }
}
