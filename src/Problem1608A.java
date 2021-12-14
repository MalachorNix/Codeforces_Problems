import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Problem1608A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringJoiner result = new StringJoiner(" ");
            int count = 2;
            result.add(count + "");
            for (int j = 1; j < n; j++) {
                result.add(++count + "");
            }
            System.out.println(result);
        }
        br.close();
    }
}
