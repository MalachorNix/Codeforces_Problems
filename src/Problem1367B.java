import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1367B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int wrongEvensPositionsNumber = 0;
            int wrongOrdinariesPositionsNumber = 0;
            for (int j = 0; j < n; j++) {
                if ((j % 2 == 0 && a[j] % 2 != 0)) {
                    wrongOrdinariesPositionsNumber++;
                    continue;
                }
                if (j % 2 == 1 && a[j] % 2 != 1) {
                    wrongEvensPositionsNumber++;
                }
            }
            System.out.println(wrongEvensPositionsNumber == wrongOrdinariesPositionsNumber ? wrongEvensPositionsNumber : -1);
        }
        br.close();
    }
}
