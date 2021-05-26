import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1360B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            br.readLine();
            List<Integer> list = Arrays.stream(br.readLine().split(" ")).
                    map(Integer::parseInt).
                    sorted().
                    collect(Collectors.toList());

            int min = Integer.MAX_VALUE;
            for (int j = 1; j < list.size(); j++) {
                int diff = list.get(j) - list.get(j - 1);
                if (diff == 0) {
                    min = 0;
                    break;
                } else {
                    if (diff < min) {
                        min = diff;
                    }
                }
            }
            System.out.println(min);
        }

        br.close();
    }
}
