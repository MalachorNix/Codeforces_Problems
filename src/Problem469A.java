import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Problem469A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> littleXLevels = Arrays.stream(br.readLine().split(" ")).skip(1).collect(Collectors.toSet());
        Set<String> littleYLevels = Arrays.stream(br.readLine().split(" ")).skip(1).collect(Collectors.toSet());
        littleXLevels.addAll(littleYLevels);
        if (littleXLevels.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
