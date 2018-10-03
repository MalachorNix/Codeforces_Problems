import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem208A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String song = scanner.next();
        scanner.close();

        String[] songWords = song.split("WUB");
        String rawSong = Arrays.stream(songWords).filter(s -> !s.equals("")).collect(Collectors.joining(" "));
        System.out.println(rawSong.trim());
    }
}
