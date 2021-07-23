import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1551A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int mod = n % 3;
            int divResult = n / 3;
            if (mod == 2) {
                System.out.println(divResult + " " + (divResult + 1));
            } else if (mod == 1) {
                System.out.println((divResult + 1) + " " + divResult);
            } else {
                System.out.println(divResult + " " + divResult);
            }
        }
        br.close();
    }
}