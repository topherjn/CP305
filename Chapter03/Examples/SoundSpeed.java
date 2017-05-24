import java.util.Scanner;

public class SoundSpeed {

    public static void main(String [] args) {

    	String medium;
    	double distance;
    	double time = -1.0;

    	Scanner keyboard = new Scanner(System.in);

    	// prompt user for distance and medium
    	// get distance from user
    	System.out.printf("Enter the distance: ");
    	distance = keyboard.nextDouble();

    	// get medium from user
    	System.out.printf("Enter the material: ");
    	medium = keyboard.next();

    	// calculate time
    	if(medium.compareTo("air") == 0) {
    		time = distance / 1100;
    	}
        else if(medium.equals("water")) {
        	time = distance / 4900;
        }
    	else if(medium.equals("steel")) {
    		time = distance / 16400;
    	}
    	// display answer
    	System.out.printf("The answer is %.3f feet per second\n", time);
    }
}