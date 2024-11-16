import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Problem1512A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            var n = Integer.parseInt(br.readLine());
            var a = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).toList();
            if (a.get(0).equals(a.get(1))) {
                for (int j = 2; j < a.size(); j++) {
                    if (!a.get(j).equals(a.get(0))) {
                        System.out.println(j + 1);
                        break;
                    }
                }
            } else {
                if (a.get(2).equals(a.get(0))) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            }
        }
        br.close();
    }
}
