import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem1560A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var t = Integer.parseInt(br.readLine());
        var memory = new ArrayList<Long>(1000);
        long num = 1;
        while (memory.size() != 1000) {
            if (num % 3 != 0 && num % 10 != 3) {
                memory.add(num);
            }
            num++;
        }
        for (int i = 0; i < t; i++) {
            var k = Integer.parseInt(br.readLine());
            System.out.println(memory.get(k - 1));
        }
        br.close();
    }
}
