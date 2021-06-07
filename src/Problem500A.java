import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Problem500A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int t = Integer.parseInt(s[1]);
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> visited = new TreeSet<>();
        visited.add(1);
        int currentPosition = 1 + a[0];
        boolean result = false;
        if (currentPosition == t) {
            result = true;
        }
        if (!result) {
            while (!visited.contains(currentPosition) && currentPosition != n) {
                visited.add(currentPosition);
                currentPosition += a[currentPosition - 1];
                if (currentPosition == t) {
                    result = true;
                    break;
                }
            }
        }
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        br.close();
    }
}
