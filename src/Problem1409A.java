import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Problem1409A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            List<Integer> list = Arrays.stream(br.readLine().split(" ")).
                    map(Integer::parseInt).
                    sorted(Comparator.reverseOrder()).
                    collect(Collectors.toList());
            int diff = Math.abs(list.get(1) - list.get(0));
            if (diff == 0) {
                System.out.println(0);
            } else {
                System.out.println((diff / 10) + (diff % 10 == 0 ? 0 : 1));
            }
        }
        br.close();
    }
}
