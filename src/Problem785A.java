import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem785A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int figuresNumber = Integer.parseInt(scanner.next());
        List<String> figures = new LinkedList<>();
        for (int i = 0; i < figuresNumber; i++) {
            figures.add(scanner.next());
        }
        scanner.close();

        int result = 0;

        for (String figure : figures) {
            switch (figure) {
                case "Tetrahedron":
                    result += 4;
                    break;
                case "Cube":
                    result += 6;
                    break;
                case "Octahedron":
                    result += 8;
                    break;
                case "Dodecahedron":
                    result += 12;
                    break;
                case "Icosahedron":
                    result += 20;
                    break;
            }
        }

        System.out.println(result);
    }
}
