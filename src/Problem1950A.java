import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem1950A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            var digits = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toUnmodifiableList());
            if (digits.get(0) < digits.get(1) && digits.get(1) < digits.get(2)) {
                System.out.println("STAIR");
            } else if (digits.get(0) < digits.get(1) && digits.get(2) < digits.get(1)) {
                System.out.println("PEAK");
            } else {
                System.out.println("NONE");
            }
        }
        br.close();
    }

}
