import java.util.Scanner;

public class RomanNumerals {

    public static void main(String [] args) {

        // declare stuff
        Scanner input = new Scanner(System.in);
        int numeral;
        String roman = "0";


    	// prompt user for a Hindu-Arabic numeral
        System.out.printf("Enter a number from 1 to 10: ");

    	// get numeral from keyboard (user)
        numeral = input.nextInt();
    	
    	// convert to Roman numeral


    	// display Roman numeral
    	System.out.printf("%d is %s in Roman numerals.\n", numeral, roman);
    }

}