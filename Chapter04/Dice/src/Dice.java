import java.util.Random;

/**
 * Created by nicholson on 5/11/2017.
 */
public class Dice {

    public static void main(String[] args) {

        Random roll = new Random();
        String display;
        int die1;
        int die2;

        die1 = roll.nextInt(6) + 1;
        die2 = roll.nextInt(6) + 1;

        int sum = die1 + die2;

        display = String.format("Your roll was %d%n", sum);

        System.out.print(display);
    }
}
