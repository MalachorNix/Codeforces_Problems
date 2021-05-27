import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem379A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        br.close();

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int result = a;
        int extinguished = a;

        while (extinguished >= b) {
            int newCandles = extinguished / b;
            result += newCandles;
            extinguished = (extinguished % b) + newCandles;
        }

        System.out.println(result);
    }
}
