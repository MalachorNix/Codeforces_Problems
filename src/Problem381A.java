import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem381A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var n = Integer.parseInt(br.readLine());
        var list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        var sergei = 0;
        var dima = 0;
        var firstIndex = 0;
        var lastIndex = n - 1;
        var used = 0;
        while (used != n) {
            int num;
            if (list.get(firstIndex) > list.get(lastIndex)) {
                num = list.get(firstIndex);
                firstIndex++;
            } else {
                num = list.get(lastIndex);
                lastIndex--;
            }
            if (used % 2 == 0) {
                sergei += num;
            } else {
                dima += num;
            }
            used++;
        }
        System.out.println(sergei + " " + dima);
        br.close();
    }
}
