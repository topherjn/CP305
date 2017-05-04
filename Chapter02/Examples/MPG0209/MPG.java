import java.util.Scanner;

public class MPG {
	
	public static void main(String [] args) {

         Scanner keyboard = new Scanner(System.in);
         double answer;

		// ask (prompt) the user for number of miles driven
         System.out.println("Enter the number of miles driven: ");

		// get number of miles from user
         int miles = keyboard.nextInt();

		// ask user for number of gallons used
        System.out.println("Enter the number of gallons used: ");

		// get number of gallons used from user
		int gallons = keyboard.nextInt();


        // calculate mpg
        // MPG = Miles driven / Gallons of gas used
        answer = (double) miles / gallons;

		// display result to user
        System.out.printf("The MPG is %.2f\n", answer);

	}
}