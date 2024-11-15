import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem9A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var max = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).max(Integer::compareTo).get();
        if (max == 6) {
            System.out.println("1/6");
        } else if (max == 1) {
            System.out.println("1/1");
        } else {
            var a = 6 - (max - 1);
            if (a == 1 || a == 5) {
                System.out.println(a+"/6");
            } else if (a == 2 || a == 4) {
                System.out.println((a/2) + "/3");
            } else {
                System.out.println("1/2");
            }
        }
        br.close();
    }
}
