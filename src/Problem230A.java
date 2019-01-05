import java.util.*;

public class Problem230A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String[] initialValues = scanner.next().split(" ");
        int powerOfKirito = Integer.parseInt(initialValues[0]);
        int numberOfDragons = Integer.parseInt(initialValues[1]);
        List<Dragon> dragons = new ArrayList<>();
        for (int i = 0; i < numberOfDragons; i++) {
            String[] powerOfDragonAndBuff = scanner.next().split(" ");
            int powerOfDragon = Integer.parseInt(powerOfDragonAndBuff[0]);
            int buff = Integer.parseInt(powerOfDragonAndBuff[1]);
            dragons.add(new Dragon(powerOfDragon, buff));
        }
        scanner.close();

        boolean killedDragonInIteration;

        do {
            boolean kill = false;

            Iterator<Dragon> iterator = dragons.iterator();
            while (iterator.hasNext()) {
                Dragon dragon = iterator.next();
                if (dragon.power < powerOfKirito) {
                    powerOfKirito += dragon.buff;
                    kill = true;
                    iterator.remove();
                }
            }

            killedDragonInIteration = kill;

        } while (killedDragonInIteration);

        if (dragons.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    private static class Dragon {

        private int power;

        private int buff;

        public Dragon(int power, int buff) {
            this.power = power;
            this.buff = buff;
        }
    }

}
