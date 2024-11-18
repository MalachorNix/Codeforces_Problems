import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1669A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            var rating = Integer.parseInt(br.readLine());
            if (rating <= 1399) {
                System.out.println("Division 4");
            } else if (rating <= 1599) {
                System.out.println("Division 3");
            } else if (rating <= 1899) {
                System.out.println("Division 2");
            } else {
                System.out.println("Division 1");
            }
        }
        br.close();
    }
}
