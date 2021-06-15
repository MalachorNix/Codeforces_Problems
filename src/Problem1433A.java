import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1433A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String x = br.readLine();
            int firstDigit = Integer.parseInt(String.valueOf(x.charAt(0)));
            int result = 10 * (firstDigit - 1) + getSumOfLength(x.length());
            System.out.println(result);
        }
        br.close();
    }

    private static int getSumOfLength(int length) {
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += i + 1;
        }
        return result;
    }

}
