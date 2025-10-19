import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int die1, die2, die3, sum;
        int rollCount = 0;

        System.out.println("\nRolling three dice until we get a triple:\n");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("------------------------------------------------");

        do {
            die1 = rand.nextInt(6) + 1;  // Random 1–6
            die2 = rand.nextInt(6) + 1;
            die3 = rand.nextInt(6) + 1;
            sum = die1 + die2 + die3;
            rollCount++;

            // Print results of each roll
            System.out.printf("%-10d%-10d%-10d%-10d%-10d%n", rollCount, die1, die2, die3, sum);

        } while (!(die1 == die2 && die2 == die3));

        System.out.println("\nTriple rolled after " + rollCount + " rolls. The number was " + die1 + ".");
    }
}
