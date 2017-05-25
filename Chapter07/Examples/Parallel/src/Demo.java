import java.util.Scanner;

/**
 * Created by nicholson on 5/25/2017.
 */
public class Demo {

    public static void main(String[] args) {

        // parallel arrays
        final int NUM_PLAYERS = 10;
        String [] players = new String[NUM_PLAYERS];
        int [] scores = new int[NUM_PLAYERS];
        int sum;
        double average;
        int max;
        int min;

        Scanner input = new Scanner(System.in);

        players[0] = "John";
        players[1] = "Chuck";
        players[2] = "Ted";
        players[3] = "Jeff";
        players[4] = "Joss";
        players[5] = "Chad";
        players[6] = "Tom";
        players[7] = "Dick";
        players[8] = "Harry";
        players[9] = "Peter";


        for(int i = 0; i < NUM_PLAYERS; i++) {
            System.out.printf("Enter the score for %s: ", players[i]);
            scores[i] = input.nextInt();
        }

        for(int i = 0; i < NUM_PLAYERS; i++) {
            System.out.printf("%s's score is %d\n", players[i], scores[i]);
        }

        max = min = sum = scores[0];

        for(int i = 1; i < scores.length; i++) {
            if(scores[i] > max) max = scores[i];
            if(scores[i] < min) min = scores[i];
            sum += scores[i];
        }

        System.out.printf("The sum of the scores is %s\n", sum);
        System.out.printf("The average of the scores is %f\n", (double)sum/NUM_PLAYERS);
        System.out.printf("The highest score is %d\n", max);
        System.out.printf("The lowest score is %d\n", min);


    }
}
