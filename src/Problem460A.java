import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem460A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        br.close();

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int result = 0;
        int socksLeft = n;

        int day = 1;
        while (socksLeft != 0) {
            result++;
            if (day % m == 0) {
                socksLeft++;
            }
            day++;
            socksLeft--;
        }

        System.out.println(result);
    }
}
