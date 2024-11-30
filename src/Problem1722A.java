import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem1722A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        char[] charArray = "Timur".toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < t; i++) {
            var n = Integer.parseInt(br.readLine());
            var word = br.readLine();
            if (n != 5) {
                System.out.println("NO");
            } else {
                char[] charArray1 = word.toCharArray();
                Arrays.sort(charArray1);
                if (Arrays.equals(charArray, charArray1)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        br.close();
    }

}
